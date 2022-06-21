<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  	
%>

<HTML>
<HEAD>
<TITLE>更新党费信息</TITLE>
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
<script language="javascript">
	/*验证表单*/
	function checkForm() {
		var jgmc = document.getElementById("dfxx.jgmc").value;
		if (jgmc == "") {
			alert('请输入机构名称!');
			return false;
		}

		var lcyy = document.getElementById("dfxx.nf").value;
		if (lcyy == "") {
			alert('年份!');
			return false;
		}
		return true;
	}
</script>

</HEAD>

<BODY background="<%=basePath%>images/adminBg.jpg">
	<s:fielderror cssStyle="color:red" />
	<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0
		width="80%" border=0>
		<TBODY>
			<TR>
				<TD align="left" vAlign=top><s:form
						action="Dfxx/Dfxx_AddDfxx.action" method="post" id="dfxxAddForm"
						onsubmit="return checkForm();" name="form1">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">
							<tr>
								<td width=30%>机构名称:</td>
								<td width=70%><input id="dfxx.jgmc" name="dfxx.jgmc"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>姓名:</td>
								<td width=70%><select name="dyxx.xm.id">
										
										<option value=''></option>

								</td>
							</tr>

							<tr>
								<td width=30%>年份:</td>
								<td width=70%><input id="dfxx.nf" name="dfxx.nf"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>一月份:</td>
								<td width=70%><input id="dfxx.yf1" name="dfxx.yf1"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>二月份:</td>
								<td width=70%><input id="dfxx.yf2" name="dfxx.yf2"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>三月份:</td>
								<td width=70%><input id="dfxx.yf3" name="dfxx.yf3"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>四月份:</td>
								<td width=70%><input id="dfxx.yf4" name="dfxx.yf4"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>五月份:</td>
								<td width=70%><input id="dfxx.yf5" name="dfxx.yf5"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>六月份:</td>
								<td width=70%><input id="dfxx.yf6" name="dfxx.yf6"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>七月份:</td>
								<td width=70%><input id="dfxx.yf7" name="dfxx.yf7"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>八月份:</td>
								<td width=70%><input id="dfxx.yf8" name="dfxx.yf8"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>九月份:</td>
								<td width=70%><input id="dfxx.yf9" name="dfxx.yf9"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>十月份:</td>
								<td width=70%><input id="dfxx.yf10" name="dfxx.yf10"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>十一月份:</td>
								<td width=70%><input id="dfxx.yf11" name="dfxx.yf11"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>十二月份:</td>
								<td width=70%><input id="dfxx.yf12" name="dfxx.yf12"
									type="text" size="20" /></td>
							</tr>







							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center"><button type="button" onclick="checkForm()" value='保存' >保存</button>
        &nbsp;&nbsp;
        <button type="reset" value='重写' >重写</button></td>
							</tr>

						</table>
					</s:form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
