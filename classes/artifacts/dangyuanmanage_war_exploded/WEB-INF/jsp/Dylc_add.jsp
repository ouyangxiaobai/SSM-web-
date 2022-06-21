<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
%>
<HTML>
<HEAD>
<TITLE>添加党员流出</TITLE>
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
<script src="<%=basePath %>js/calendar.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
<script language="javascript">
	/*验证表单*/
	function checkForm() {
		var jgmc = document.getElementById("organizationName").value;
		if (jgmc == "") {
			alert('请输入机构名称!');
			return false;
		}
		var xm = document.getElementById("partymemName").value;
		if (xm == "") {
			alert('请输入姓名!');
			return false;
		}
		var xb = document.getElementById("gender").value;
		if (xb == "") {
			alert('请输入性别!');
			return false;
		}
		var lcyy = document.getElementById("outflowCauses").value;
		if (lcyy == "") {
			alert('请输入流出原因!');
			return false;
		}
		////$.post("<%=basePath%>Admin/insertPartymemOutflow.action",$("#dylcAddForm").serialize(),function(data){
				alert("党员信息更新成功！");
				//window.location.reload();
		//	});
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
				<form action="insertPartymemOutflow.action" method="post" id="dylcAddForm" name="form1" enctype="multipart/form-data" onsubmit="return checkForm()">
						<table width='100%' cellspacing='1' cellpadding='3'
							class="tablewidth">

							<tr>
								<td width=30%>机构名称:</td>
								<td width=70%><input id="organizationName" name="organizationName"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>姓名:</td>
								<td width=70%><input id="partymemName" name="partymemName"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>性别:</td>
								<td width=70%><select	id="gender" name="gender">
    	<option value="">--请选择--</option>
    	<option value="1">男</option>
    	<option value="0">女</option>
    </select></td>
							</tr>

							<tr>
								<td width=30%>出生日期:</td>
								<td width=70%><input type="text" readonly id="birthday"
									name="birthday" onclick="setDay(this);" /></td>
							</tr>

							<tr>
    <td width=30%>民族:</td>
    <td width=70%>
      <select name="nation">
      <c:forEach items="${nation }" var="row">
          <option value='${row.nation }'>${row.nation }</option>
      </c:forEach></select>
    </td>
  </tr>

  <tr>
    <td width=30%>籍贯:</td>
    <td width=70%>
      <select name="nativeplace">
      <c:forEach items="${nativeplace }" var="row">
          <option value='${row.nativeplace }'>${row.nativeplace }</option>
     </c:forEach></select>
    </td>
  </tr>

  <tr>
    <td width=30%>文化程度:</td>
    <td width=70%>
      <select name="educationLevel">
     <c:forEach items="${education }" var="row">
          <option value='${row.educationLevel }'>${row.educationLevel }</option>
     </c:forEach></select>
    </td>
  </tr>

							<tr>
								<td width=30%>职业:</td>
								<td width=70%><input id="occupation" name="occupation"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>入党时间:</td>
								<td width=70%><input type="text" readonly id="joiningPartytime"
									name="joiningPartytime" onclick="setDay(this);" /></td>
							</tr>

							<!-- <tr>
								<td width=30%>党内职务:</td>
								<td width=70%><input id="partyPosts" name="partyPosts"
									type="hidden" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>党外职务:</td>
								<td width=70%><input id="nonPartyduties" name="nonPartyduties"
									type="hidden" size="20" /></td>
							</tr> -->

							<tr>
								<td width=30%>流出原因:</td>
								<td width=70%><input id="outflowCauses" name="outflowCauses"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>流出日期:</td>
								<td width=70%><input type="text" readonly id="outflowtime"
									name="outflowtime" onclick="setDay(this);" /></td>
							</tr>

							<tr>
								<td width=30%>流出地机构:</td>
								<td width=70%><input id="outflowMechanism" name="outflowMechanism"
									type="text" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>流出地电话:</td>
								<td width=70%><input id="outflowTelephone" name="outflowTelephone"
									type="text" size="20" /></td>
							</tr>

							<!-- <tr>
								<td width=30%>原机构电话:</td>
								<td width=70%><input id="originalinstitutionPhone" name="originalinstitutionPhone"
									type="hidden" size="20" /></td>
							</tr>

							<tr>
								<td width=30%>原机构名称:</td>
								<td width=70%><input id="originalinstitutionName" name="originalinstitutionName"
									type="hidden" size="20" /></td>
							</tr>
 -->
							<tr>
								<td width=30%>照片:</td>
								<td width=70%><input id="avatar" name="avatar" type="file"
									size="50" /></td>
							</tr>

							<tr>
								<td width=30%>党员备注:</td>
								<td width=70%><textarea id="partymemRemarks" name="partymemRemarks"
										rows="6" cols="80"></textarea></td>
							</tr>

							<tr bgcolor='#FFFFFF'>
							<td colspan="4" align="center">
								<input type="submit" value='保存' >
								&nbsp;&nbsp;
								<button type="reset" value='重写' >重写</button>
								</td>
							</tr>

						</table>
					</form></TD>
			</TR>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
