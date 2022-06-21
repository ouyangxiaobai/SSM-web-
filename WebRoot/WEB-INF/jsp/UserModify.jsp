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
<script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
	<script src="<%=basePath%>js/swfobject.js" type="text/javascript"></script>
	
	<style>
        html, body { height:100%; }
        body { margin:0; 
        background-color: #f5f5f5;
        }
        .nav ul span {float:right; }
    </style>
    <script language="javascript">
/*验证表单*/
function checkForm() {
    var jgmc = document.getElementById("username").value;
    if(jgmc=="") {
        alert('请输入姓名!');
        return false;
    }
    
    $.post("<%=basePath%>User/UserModify.action",$("#UserModifyForm").serialize(),function(data){
				alert("信息更新成功！");
				//window.location.reload();
			});
    return true; 
}
 </script>
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
			<span class="STYLE1">欢迎您:<a href="<%=basePath%>login/login_view.action"><font color=blue><%=session.getAttribute("username")%></font></a>&nbsp;</span>
													</div>
			<br />
		</div>

<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><br>
    <form action="<%=basePath %>password/ChangePassword.action" method="post" name="form1" id="UserModifyForm">
<table width='100%' cellspacing='1' cellpadding='3' bgcolor='#CCCCCC' class="tablewidth">
  
  
  <tr>
  	<td align="right" width="35%">姓名:</td>
    <td width=65%><input name="username" type="hidden" value='<%=session.getAttribute("userId")%>'/>
    <input name="username" type="text" id="username" value='<%=session.getAttribute("username")%>'/></td>   
  </tr>
 
  <tr bgcolor='#FFFFFF'> 
      <td colspan="4" align="center"> 
        <button type="button" onclick="checkForm()" value='修改' >修改</button>
        &nbsp;&nbsp;
      </td>
    </tr>
</table>
</form>
   </TD>
	</TR>
  </TBODY>
</TABLE>
</div>
</body>
</html>
