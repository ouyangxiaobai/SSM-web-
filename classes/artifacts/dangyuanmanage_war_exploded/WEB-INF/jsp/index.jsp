<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<c:set var="url" value="pictureUrl.action?url=E:/myvod/img/"></c:set>
<html>
<head>
<title>学院党务系统-首页</title>
<link href="<%=basePath%>css/index.css" rel="stylesheet"
	type="text/css" />
	<link href="css/indexMovie.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style2.css" rel="stylesheet" type="text/css" media="all" />
<!-- start plugins -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script src="js/responsiveslides.min.js"></script>
<link rel="stylesheet" href="css/baidulogin.css" />
	<script src="<%=basePath%>js/swfobject.js" type="text/javascript"></script>
	
	<style>
        html, body { height:100%; }
        body { margin:0; 
        background-color: #f5f5f5;
        }
        .nav ul span {float:right; }
    </style>
</head>
<body>
	<div id="container">
		<div id="banner">
			<img src="<%=basePath%>images/logo.jpg" />
		</div>
		<div id="globallink">
			<ul>
				<li><a href="<%=basePath%>index.jsp">首页</a></li>
				<li><a href="<%=basePath%>index.jsp">上传心得</a></li>
			</ul>
			<div align="right">
			<span class="STYLE1">欢迎您:<a href="<%=basePath%>User/UserModifyPage.action"><font color=blue><%=session.getAttribute("username")%></font></a>&nbsp;</span>
													</div>
			<br />
		</div>


					<!--高分电影-->
					<div class="col-md-5 grid_3">
						<br />
						
						<form>
							<div class="row_1">
								<div class="col-md-6 grid_4">
									<c:forEach var="movie" items="${movies}" begin="0" end="2">
										<br>
										<div class="grid_2">
											<a href="player.action?movie=${movie.id}${movie.mvType}">
												<img src="${url}${movie.id}${movie.imgType}"
												class="img-responsive" alt="${movie.movieName}"
												style="width: 200px; height: 183px" title="点击播放"  />
											</a>
										</div>
										<div class="caption1">
											<p class="m_3">
												<a
													href="player.action?movie=${movie.id}${movie.mvType}">${movie.movieName}66${movie.imgType}</a>
											</p>
											<p class="m_4">${movie.message}</p>
										</div>
										<br>
									</c:forEach>
								</div>

								<div class="col-md-6 grid_4">
									<c:forEach var="movie" items="${movies}" begin="3" end="5">
										<br>
										<div class="grid_2">
											<a href="player.action?movie=${movie.id}${movie.mvType}">
												<img src="${url}${movie.id}${movie.imgType}"
												class="img-responsive" alt="${movie.movieName}"
												style="width: 200px; height: 183px" title="点击播放" />
											</a>
										</div>
										<div class="caption1">
											<p class="m_3">
												<a
													href="player.action?movie=${movie.id}${movie.mvType}">${movie.movieName}</a>
											</p>
											<p class="m_4">${movie.message}</p>
										</div>
										<br>
									</c:forEach>
								</div>
								<div class="clearfix"></div>
								<br>
								
							</div>
						</form>
					</div>

					<!--热播电视剧-->
					<div class="col-md-5 content_right grid_3">
						<br />
						
						<div class="row_3">
							<div class="col-md-6 grid_4">
								<c:forEach var="movie" items="${movies}" begin="6" end="8">
										<br>
										<div class="grid_2">
											<a href="player.action?movie=${movie.id}${movie.mvType}">
												<img src="${url}${movie.id}${movie.imgType}"
												class="img-responsive" alt="${movie.movieName}"
												style="width: 200px; height: 183px" title="点击播放"  />
											</a>
										</div>
										<div class="caption1">
											<p class="m_3">
												<a
													href="player.action?movie=${movie.id}${movie.mvType}">${movie.movieName}</a>
											</p>
											<p class="m_4">${movie.message}</p>
										</div>
										<br>
									</c:forEach>
							</div>

							<div class="col-md-6 grid_4">
								<c:forEach var="movie" items="${movies}" begin="8" end="10">
										<br>
										<div class="grid_2">
											<a href="player.action?movie=${movie.id}${movie.mvType}">
												<img src="${url}${movie.id}${movie.imgType}"
												class="img-responsive" alt="${movie.movieName}"
												style="width: 200px; height: 183px" title="点击播放"  />
											</a>
										</div>
										<div class="caption1">
											<p class="m_3">
												<a
													href="player.action?movie=${movie.id}${movie.mvType}">${movie.movieName}</a>
											</p>
											<p class="m_4">${movie.message}</p>
										</div>
										<br>
									</c:forEach>
							</div>
							<div class="clearfix"></div>
							<br>
							
						</div>
					</div>
</div>
</body>
</html>
