<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String username = (String) session.getAttribute("username");
	/*    if(username==null){
	       response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
	   } */
%>
<HTML>
<HEAD>
<TITLE>添加籍贯信息</TITLE>

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
<script src="<%=basePath%>calendar.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.js"></script>
<script language="javascript">
	/*验证表单*/
	function checkForm() {
		var jg = document.getElementById("nativeplace").value;
		if (jg == "") {
			alert('请输入籍贯!');
			return false;
		}
		$.post("<%=basePath%>Admin/insertNativeplace.action", $("#jgxxAddForm").serialize(), function(data) {
			alert("籍贯信息更新成功！");
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
				<TD align="left" vAlign=top>
					<form action="Jgxx/Jgxx_AddJgxx.action" method="post"
						id="jgxxAddForm" name="form1">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">

							<tr>
								<td width=30%>籍贯:</td>
								<td width=70%><input id="nativeplace" name="nativeplace"
									type="text" size="20" /></td>
							</tr>

							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center">
									<button type="button" onclick="checkForm()" value='保存'>
										&nbsp;&nbsp; <input type="reset" value='重写' />
								</td>
							</tr>

						</table>
					</form>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
