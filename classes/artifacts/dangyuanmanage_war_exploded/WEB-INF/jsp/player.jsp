<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
%>
<c:set var="moviePath" 
	value="http://localhost:8080/dangyuanmanage/getMovie.action?url=E:/myvod/video/">
</c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="cxtPath" value="${pageContext.request.contextPath}"></c:set>
<c:set var="url" value="pictureUrl.action?url=E:/myvod/img/"></c:set>
<c:set var="url_user" value="pictureUrl?url=E:/myvod/img/"></c:set>
<html>
	<head>
		<title>播放器</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="在线视频网站" />
		<script src="ckplayer/ckplayer.js" type="text/javascript" charset="utf-8"></script>
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>

		<link href="${cxtPath}/css/indexMovie.css" rel='stylesheet' type='text/css' />
		<link href="${cxtPath}/css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="${cxtPath}/css/style2.css" rel="stylesheet" type="text/css" media="all" />
		<!-- start plugins -->
		<script type="text/javascript" src="${cxtPath}/js/jquery-1.11.1.min.js"></script>
		<script src="${cxtPath}/js/responsiveslides.min.js"></script>
		<script language="javascript">
/*验证表单*/
function checkForm() {
    var recontent = document.getElementById("recontent").value;
    if(recontent=="") {
        alert('请输入评论内容!');
        return false;
    }
    
    $.post("<%=basePath%>Review/insertReview.action",$("#reviewform").serialize(),function(data){
				alert("党员信息更新成功！");
				//window.location.reload();
			});
    return true; 
}
 </script>
	</head>

	<body>
		<div class="container">
			<div class="container_wrap">
			<!--顶部-->
				
					<div class="clearfix"> </div>
				</div>
				<div class="content">
					<div class="movie_top">
						<!--主体的左边-->
						<div class="col-md-10 movie_box">
							<div id="ckplayer" style="width: 800; height: 500;margin-top: -1%;"></div>
							<script type="text/javascript">
								CKobject.embed("ckplayer/ckplayer.swf", "ckplayer", "ckplayer1", "800",
										"500", true, {
											f : "video/mp4",
											c : 0
										}, ['${moviePath}/${movieResult.id}${movieResult.mvType}']

									);
							</script>
							<br>
							<p class="m_5">视频描述：${movieResult.message}</p>
							<br><br><br>
							<br><br><br>
							<form method="post" action="" id="reviewform">
								<div class="text">
								<input type="hidden" name="reuid" value="${sessionScope.userId}"></input>
								<input type="hidden" name="mid" value="${movieResult.id}"></input>
									<textarea name="recontent" id="recontent" value="Message" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '我的评论:';}">我的评论:</textarea>
								</div>
								<div class="form-submit1">
									<button type="button" onclick="checkForm()" value='评论' >评论</button><br>
								</div>
							</form>
							<!--评论列表-->
							<div class="single">
								<h1><font color="#FFFFFF">用户评论列表</font></h1>
								<ul class="single_list">
								<c:forEach items="${review }" var="row">
									<li>
										<div class="preview">
											<a href="#"><img src="images/2.jpg" class="img-responsive" alt="">${row.user.username}</a>
										</div>
										<div class="data">
											<div class="title" style="margin-left: 20px;">
												<font color="#FFFFFF">发表评论的时间 ${row.reviewtime }</font>
											</div>
											<p style="margin-left: 20px;">
												<font color="#FFFFFF">${row.recontent }</font>
											</p>
										</div>
										<div class="clearfix"></div>
									</li>
									</c:forEach>
									

								</ul>
							</div>
						</div>
						</div>

						<div class="col-md-2" style="margin-top: -20px">
							<h3><font color="#FFFFFF">播放列表</font></h3>
							<%-- <c:forEach items="${movies}" var="mv" begin="${i-2}" end="${i}"> --%>
								<div class="grid_2 col_1">
								<a href="player.action?movie=${movies.id}${movies.mvType}">
								<c:if test="${movies.adminId!=null}">
									<img src="${url}${movies.id}${movies.imgType}" title="点击播放"
									 class="img-responsive" alt="视频缩略图" style="width: 143.11px;height: 145px">
								</c:if>
								
								<c:if test="${movies.adminId==null}">
									<img src="${url}${movies.id}${movies.imgType}" title="点击播放"
									 class="img-responsive" alt="视频缩略图" style="width: 143.11px;height: 145px">
								</c:if>
								 </a>
								<div class="caption1">
									<p class="m_3">${movies.movieName}</p>
									<c:if test="${movies.id == movieResult.id}">
										<p class="m_32" title="正在播放">&nbsp;&nbsp;正在播放	. . .</p>
									</c:if>
								</div>
							</div>
							<%-- </c:forEach> --%>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
		</div>

	</body>

</html>