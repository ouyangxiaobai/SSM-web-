<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	String username = (String) session.getAttribute("username");
	/*     if(username==null){
	        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
	    } */
%>
<HTML>
<HEAD>
<TITLE>修改公告信息</TITLE>
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
		var noticeTitle = document.getElementById("noticeTitle").value;
		if (noticeTitle == "") {
			alert('请输入标题!');
			return false;
		}
		var noticeContent = document.getElementById("noticeContent").value;
		if (noticeContent == "") {
			alert('请输入内容!');
			return false;
		}
		$.post("<%=basePath%>Notice/ModifyNotice.action", $("#NoticeModifyForm").serialize(), function(data) {
			alert("公告信息更新成功！");
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
						action="Jgxx/Jgxx_ModifyJgxx.action" method="post" name="form1"
						id="NoticeModifyForm">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">
							<tr>
								<td width=30%>编号:</td>
								<td width=70%><input id="nid" name="nid" type="text"
									value="${notice.nid }" readOnly /></td>
							</tr>

							<tr>
								<td width=30%>标题:</td>
								<td width=70%><input id="noticeTitle" name="noticeTitle"
									type="text" size="20" value='${notice.noticeTitle }' /></td>
							</tr>
<tr>
								<td width=30%>内容:</td>
								<td width=70%><input id="noticeContent" name="noticeContent"
									type="text" size="20" value='${notice.noticeContent }' /></td>
							</tr>
							
							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center">
									<button type="button" onclick="checkForm()" value='保存'>保存</button>
										&nbsp;&nbsp; <input type="reset" value='重写' />
								</td>
							</tr>

						</table>
					</form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
