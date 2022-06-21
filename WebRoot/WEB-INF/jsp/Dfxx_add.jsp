<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  	
%>

<HTML>
<HEAD>
<TITLE>添加党费信息</TITLE>
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
 <script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
<script language="javascript">
	/*验证表单*/
	function checkForm() {
		var jgmc = document.getElementById("organizationName").value;
		if (jgmc == "") {
			alert('请输入机构名称!');
			return false;
		}

		var lcyy = document.getElementById("particularYear").value;
		if (lcyy == "") {
			alert('年份!');
			return false;
		}
		$.post("<%=basePath%>Admin/paymentPartymem.action",$("#dfxxAddForm").serialize(),function(data){
				alert("党员信息更新成功！");
				//window.location.reload();
			});
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
				<TD align="left" vAlign=top><form
						action="Dfxx/Dfxx_AddDfxx.action" method="post" id="dfxxAddForm" name="form1">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">
							<input id="id" name="id" type="hidden" size="20" value='${partymemDues.id }'/>
							<tr>
								<td width=30%>机构名称:</td>
								<td width=70%><input id="organizationName" name="organizationName" type="text" size="20" value='${partymemDues.organizationName }'/></td>
							</tr>
							<tr>
								<td width=30%>姓名:</td>
								<td width=70%><input id="partymemName" name="partymemName" type="text" size="20" value='${partymemDues.partymemName }'/>
								<input id="partymemId" name="partymemId" type="hidden" size="20" value='${partymemDues.partymemId }'/>
								</td>
							</tr>

							<tr>
								<td width=30%>年份:</td>
								<td width=70%><input id="particularYear" name="particularYear" type="text" size="20" value='${partymemDues.particularYear }'/></td>
							</tr>

							<tr>
								<td width=30%>一月份:</td>
								<td width=70%><input id="january" name="january" type="text" size="20" value='${partymemDues.january }'/></td>
							</tr>
							<tr>
								<td width=30%>二月份:</td>
								<td width=70%><input id="february" name="february" type="text" size="20" value='${partymemDues.february }'/></td>
							</tr>

							<tr>
								<td width=30%>三月份:</td>
								<td width=70%><input id="march" name="march" type="text" size="20" value='${partymemDues.march }'/></td>
							</tr>

							<tr>
								<td width=30%>四月份:</td>
								<td width=70%><input id="april" name="april" type="text" size="20" value='${partymemDues.april }'/></td>
							</tr>

							<tr>
								<td width=30%>五月份:</td>
								<td width=70%><input id="may" name="may" type="text" size="20" value='${partymemDues.may }'/></td>
							</tr>

							<tr>
								<td width=30%>六月份:</td>
								<td width=70%><input id="june" name="june" type="text" size="20" value='${partymemDues.june }'/></td>
							</tr>

							<tr>
								<td width=30%>七月份:</td>
								<td width=70%><input id="july" name="july" type="text" size="20" value='${partymemDues.july }'/></td>
							</tr>

							<tr>
								<td width=30%>八月份:</td>
								<td width=70%><input id="august" name="august" type="text" size="20" value='${partymemDues.august }'/></td>
							</tr>

							<tr>
								<td width=30%>九月份:</td>
								<td width=70%><input id="september" name="september" type="text" size="20" value='${partymemDues.september }'/></td>
							</tr>

							<tr>
								<td width=30%>十月份:</td>
								<td width=70%><input id="october" name="october" type="text" size="20" value='${partymemDues.october }'/></td>
							</tr>

							<tr>
								<td width=30%>十一月份:</td>
								<td width=70%><input id="november" name="november" type="text" size="20" value='${partymemDues.november }'/></td>
							</tr>

							<tr>
								<td width=30%>十二月份:</td>
								<td width=70%><input id="december" name="december" type="text" size="20" value='${partymemDues.december }'/></td>
							</tr>







							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center"><button type="button" onclick="checkForm()" value='保存' >保存</button>
        &nbsp;&nbsp;
        <button type="reset" value='重写' >重写</button></td>
							</tr>

						</table>
					</form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
