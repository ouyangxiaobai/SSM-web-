<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		
		<link href="<%=path %>/css/layout.css" type="text/css" rel="stylesheet" />
		
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		<script type="text/javascript">
	    </script>
	</head>

	<body>
		<%@ include file="incTop.jsp"%>
		<div class="page_row">
			<!--左边的 -->
			<div class="page_main_msg left">		
		        <div class="left_row">
		            <div class="list pic_news">
		  	                <div class="list_bar">&nbsp;导航</div>
						  	<div class="ctitle ctitle1">${notice.noticeTitle}</div>
							<div class="ctitleinfo">${notice.noticeDate}&nbsp;&nbsp;&nbsp;<%--查看次数：5 次--%></div>
							<div class="pbox">${notice.noticeContent}</div>
				            <div class="page_no">
				                <div class="pg-3">
				                </div>
				            </div>
							<div class="arti_ref">
							    <%--【上一篇】: <a href="#" title="">应需而生 长安铃木全新天语SX4突破升级</a>
				                &nbsp;&nbsp;
				                 【下一篇】: <span>没有了</span>--%>
				            </div>	
		             </div>
		         </div>	
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
										     <c:forEach var="notice" items="${noticelist}">
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
<!-- 右边的用户登录。留言。投票 -->

	</body>
</html>
