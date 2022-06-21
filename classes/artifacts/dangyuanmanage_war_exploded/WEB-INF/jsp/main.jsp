<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			String username=(String)session.getAttribute("Adminname");
			System.out.println("名字"+username);
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "index.action';</script>");
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理系统主界面</title>
</head>

<frameset rows="98,*,25" frameborder="no" border="0" framespacing="0">
	<frame src="<%=basePath%>top.action" name="topFrame" scrolling="no"
		noresize="noresize" id="topFrame" />


	<frame src="<%=basePath%>center.action" name="mainFrame" id="mainFrame" />
	<frame src="<%=basePath%>down.action" name="bottomFrame" scrolling="no"
		noresize="noresize" id="bottomFrame" />
	
</frameset>
<noframes>
	<body>
	
	</body>
</noframes>
</html>
