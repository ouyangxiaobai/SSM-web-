<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username=(String)session.getAttribute("username");
    /* if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    } */
%>
<HTML>
<HEAD>
<TITLE>修改民族信息</TITLE>
<STYLE type=text/css>
BODY {
	MARGIN-LEFT: 0px;
	BACKGROUND-COLOR: #ffffff
}

.STYLE1 {
	color: #ECE9D8
}

.label {
	font-style .: italic;
}

.errorLabel {
	font-style .: italic;
	color: red;
}

.errorMessage {
	font-weight: bold;
	color: red;
}
</STYLE>
<script src="<%=basePath %>calendar.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
<script language="javascript">
	/*验证表单*/
	function checkForm() {
		var mz = document.getElementById("nation").value;
		if (mz == "") {
			alert('请输入民族!');
			return false;
		}
		$.post("<%=basePath%>Admin/modifyNation.action", $("#MzxxbjForm").serialize(), function(data) {
			alert("病历信息更新成功！");
		//window.location.reload();
		});
		return true;
	}
</script>
</HEAD>
<BODY background="<%=basePath%>images/adminBg.jpg">
	<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0
		width="80%" border=0>
		<TBODY>
			<TR>
				<TD align="left" vAlign=top><form
						action="Mzxx/Mzxx_ModifyMzxx.action" method="post" name="form1"
						id="MzxxbjForm">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">
							<tr>
								<td width=30%>记录编号:</td>
								<td width=70%><input id="id" name="id" type="text"
									value="${nation.id }" readOnly /></td>
							</tr>

							<tr>
								<td width=30%>民族:</td>
								<td width=70%><input id="nation" name="nation"
									value="${nation.nation }" type="text" size="30" value='' /></td>
							</tr>

							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center">
									<button type="button" onclick="checkForm()" value='保存'>
										&nbsp;&nbsp; <input type="reset" value='重写' />
								</td>
							</tr>

						</table>
						<form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
