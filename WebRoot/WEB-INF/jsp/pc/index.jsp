<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<c:set var="url" value="pictureUrl.action?url=E:/myvod/img/"></c:set>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="title" content="基于web的学院党务系统的设计与实现" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		
		<link href="<%=path %>/css/layout.css" type="text/css" rel="stylesheet" />
		
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
	    <script type="text/javascript">
	    function liuyanAll()
	        {
	        var myName="<%=(String)session.getAttribute("username")%>"
	        //alert(myName);
	            if(myName=="null"){
	                  alert("请先登录");
	                  }else{
	                 var url="<%=path %>/Liuyan/LiuyanPage.action";
				     window.open(url,"_blank");
				     }
	        }
	    </script>
	    <style>
element.style {
    width: 100%;
    height: 219px;
    padding-right: 10px;
}
	    </style>
	</head>

	<body>
		<%-- <jsp:include flush="true" page="./jsp/pc/incTop.jsp"></jsp:include> --%>
		<%@ include file="incTop.jsp"%>
		<div class="page_row">
		    <!--左边的 -->
			<div class="page_main_msg left">
				<!-- 排行榜 -->
				<div class="left_row">
					<div class="list pic_news">
						<div class="list_bar">
							党的介绍
						</div>
						<div id="tw" class="list_content">
							<div style="width:100%;">
								<p style="text-align: left;
    line-height: 34px;">中国共产党（英文名：the Communist Party of China，简写CPC），简称中共，创建于1921年7月23日 [1]  ，历经多年国共内战，中国共产党在中国大陆和绝大多数沿海岛屿取得全面胜利，率领中国人民解放军打败中华民国国军，迫使中华民国政府退守台澎金马，并在1949年于北京建立中华人民共和国。1949年10月至今为代表工人阶级领导工农联盟和统一战线，在中国大陆实行人民民主专政的中华人民共和国唯一执政党。
中国共产党是中国工人阶级的先锋队，同时是中国人民和中华民族的先锋队，是中国特色社会主义事业的领导核心，代表中国先进生产力的发展要求，代表中国先进文化的前进方向，代表中国最广大人民的根本利益。党的最高理想和最终目标是实现共产主义。 [2]</p>			  
							</div>
						 </div>
					</div>
				</div>
				<!-- 排行榜 -->
				
			</div>
			<!--左边的 -->
			
			<!-- 右边的用户登录。留言。投票 -->
			<div class="page_other_msg right">
				<div class="left_row">
					<div class="list">
						<div class="list_bar">
							用户登录
						</div>
						<div class="list_content">
							<div id="div">
							<%@ include file="userlogin.jsp"%>
							</div>
						</div>
					</div>
				</div>
                
				<div class="left_row">
				    <div class="list">
				        <div class="list_bar">网站公告</div>
				        <div class="list_content">
				            <div id="div"> 
				                   <div style="overflow:hidden;height:150px;">
							             <div id="roll-orig-1607838439">
										 <table width="100%" cellpadding="0" cellspacing="0" border="0">
										     <c:forEach var="notice" items="${notice}">
										          <tr>
										          <td height="28" id="roll-line-1607838439" width="100%">
										          <div class="" style="padding:2px 0px;">
										          <div class="f-left">
										          <img src="<%=path %>/img/head-mark3.gif" align="middle" class="img-vm" border="0"/> 
										          <a href="<%=path %>/Notice/gonggaoDetailQian.action?gonggaoId=${notice.nid}" title="">
										          <span style="">${notice.noticeTitle}…</span>
										          </a>
										          </div>
										          <div class="clear">
										          </div>
										          </div>
										          </td>
										          </tr>
										     </c:forEach>
										 </table>
										 </div>
						                 <div id="roll-copy-1607838439"></div>
				                   </div>
					        </div>
					    </div>
				    </div>
				</div>
			</div>
			<div style="clear: both"></div>
			<!-- 右边的用户登录。留言。投票 -->
		</div>

	</body>
</html>
