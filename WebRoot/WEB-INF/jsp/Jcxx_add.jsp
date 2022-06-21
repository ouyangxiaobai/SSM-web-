<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>

<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
%>
<HTML>
<HEAD>
<TITLE>添加奖惩信息</TITLE>
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
		var szdw = document.getElementById("jcxx.szdw").value;
		if (szdw == "") {
			alert('请输入所在单位!');
			return false;
		}
		var xm = document.getElementById("jcxx.xm").value;
		if (xm == "") {
			alert('请输入姓名!');
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
						action="Jcxx/Jcxx_AddJcxx.action" method="post" id="jcxxAddForm"
						onsubmit="return checkForm();" enctype="multipart/form-data"
						name="form1">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">

							<tr>
								<td width=30%>所在单位:</td>
								<td width=70%><input id="jcxx.szdw" name="jcxx.szdw"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>姓名:</td>
								<td width=70%><input id="jcxx.xm" name="jcxx.xm"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>性别:</td>
								<td width=70%><input id="jcxx.xb" name="jcxx.xb"
									type="text" size="6" /></td>
							</tr>
							
							<tr>
								<td width=30%>出生日期:</td>
								<td width=70%><input type="text" readonly id="jcxx.csrq"
									name="jcxx.csrq" onclick="setDay(this);" /></td>
							</tr>
							<tr>
								<td width=30%>民族:</td>
								<td width=70%><select name="jcxx.mz.id">
										
										<option value=''></option>
										
								</td>
							</tr>
							<tr>
								<td width=30%>职务:</td>
								<td width=70%><input id="jcxx.zw" name="jcxx.zw"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>奖惩性质:</td>
								<td width=70%><input id="jcxx.jcxz" name="jcxx.jcxz"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>奖惩时间:</td>
								<td width=70%><input type="text" readonly id="jcxx.jcsj"
									name="jcxx.jcsj" onclick="setDay(this);" /></td>
							</tr>
							<tr>
								<td width=30%>主要内容:</td>
								<td width=70%><textarea id="jcxx.zynr" name="jcxx.zynr"
										rows="6" cols="80"></textarea></td>
							</tr>
							<tr>
								<td width=30%>报批单位:</td>
								<td width=70%><input id="jcxx.bpdw" name="jcxx.bpdw"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>报批日期:</td>
								<td width=70%><input type="text" readonly id="jcxx.bprq"
									name="jcxx.bprq" onclick="setDay(this);" /></td>
							</tr>


							<tr>
								<td width=30%>报批意见:</td>
								<td width=70%><input id="jcxx.bpyj" name="jcxx.bpyj"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>审批部门:</td>
								<td width=70%><input id="jcxx.spbm" name="jcxx.spbm"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>审批日期:</td>
								<td width=70%><input type="text" readonly id="jcxx.sprq"
									name="jcxx.sprq" onclick="setDay(this);" /></td>
							</tr>
							<tr>
								<td width=30%>审批意见:</td>
								<td width=70%><input id="jcxx.spyj" name="jcxx.spyj"
									type="text" size="20" /></td>
							</tr>
							<tr>
								<td width=30%>备注信息:</td>
								<td width=70%><input id="jcxx.bzxx" name="jcxx.bzxx"
									type="text" size="20" /></td>
							</tr>

							<tr bgcolor='#FFFFFF'>
								<td colspan="4" align="center"><input type='submit'
									name='button' value='保存'> &nbsp;&nbsp; <input
									type="reset" value='重写' /></td>
							</tr>

						</table>
					</s:form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
