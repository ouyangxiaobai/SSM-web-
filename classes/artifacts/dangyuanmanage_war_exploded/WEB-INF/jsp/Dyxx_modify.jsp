<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
%>
<HTML><HEAD><TITLE>修改党员信息</TITLE>
 <script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
<STYLE type=text/css>
BODY {
	MARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff
}
.STYLE1 {color: #ECE9D8}
.label {font-style.:italic; }
.errorLabel {font-style.:italic;  color:red; }
.errorMessage {font-weight:bold; color:red; }
</STYLE>
 <script src="<%=basePath %>js/calendar.js"></script>
<script language="javascript">
/*验证表单*/
function checkForm() {
    var jgmc = document.getElementById("organizationName").value;
    if(jgmc=="") {
        alert('请输入机构名称!');
        return false;
    }
    var xm = document.getElementById("partymemName").value;
    if(xm=="") {
        alert('请输入姓名!');
        return false;
    }
    var xb = document.getElementById("gender").value;
    if(xb=="") {
        alert('请输入性别!');
        return false;
    }
    var dyzt = document.getElementById("status").value;
    if(dyzt=="") {
        alert('请输入党员状态!');
        return false;
    }
   // $.post("<%=basePath%>Admin/updatePartymemInformation.action",$("#dyxxModifyForm").serialize(),function(data){
				alert("党员信息更新成功！");
				//window.location.reload();
		//	});
    return true; 
}
 </script>
</HEAD>
<BODY background="<%=basePath %>images/adminBg.jpg">
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top >
    <form action="updatePartymemInformation.action" method="post" name="form1" id="dyxxModifyForm" enctype="multipart/form-data" onsubmit="return checkForm()">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%><input id="id" name="id" type="text" value="${partymem.id }" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>机构名称:</td>
    <td width=70%><input id="organizationName" name="organizationName" type="text" size="20" value='${partymem.organizationName }'/></td>
  </tr>

  <tr>
    <td width=30%>姓名:</td>
    <td width=70%><input id="partymemName" name="partymemName" type="text" size="20" value='${partymem.partymemName }'/></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%>
    <select	id="gender" name="gender" value='${partymem.gender }'>
    	<option value="">--请选择--</option>
    	<option value="1">男</option>
    	<option value="0">女</option>
    </select>
</td>
  </tr>

  <tr>
    <td width=30%>出生日期:</td>
    <td width=70%><input type="text" readonly  id="birthday"  name="birthday" onclick="setDay(this);" value='${partymem.birthday }'/></td>
  </tr>

  <tr>
    <td width=30%>民族:</td>
    <td width=70%>
    <select name="nation">
      <c:forEach items="${nation }" var="row">
          <option value='${row.nation }'>${row.nation }</option>
      </c:forEach>
      </select>
    </td>
  </tr>

  <tr>
    <td width=30%>籍贯:</td>
    <td width=70%>
      <select name="nativeplace">
     <c:forEach items="${nativeplace }" var="row">
          <option value='${row.nativeplace }'>${row.nativeplace }</option>
     </c:forEach>
     </select>
    </td>
  </tr>

  <tr>
    <td width=30%>文化程度:</td>
    <td width=70%>
      <select name="educationLevel">
     <c:forEach items="${education }" var="row">
          <option value='${row.educationLevel }'>${row.educationLevel }</option>
     </c:forEach>
     </select>
    </td>
  </tr>

  <tr>
    <td width=30%>职业:</td>
    <td width=70%><input id="occupation" name="occupation" type="text" size="20" value='${partymem.occupation }'/></td>
  </tr>

  <tr>
    <td width=30%>入党时间:</td>
    <td width=70%><input type="text" readonly  id="joiningPartytime"  name="joiningPartytime" onclick="setDay(this);" value='${partymem.joiningPartytime }'/></td>
  </tr>

  <tr>
    <td width=30%>流入时间:</td>
    <td width=70%><input type="text" readonly  id="inflowTime"  name="inflowTime" onclick="setDay(this);" value='${partymem.inflowTime }'/></td>
  </tr>

  <tr>
    <td width=30%>入党介绍人:</td>
    <td width=70%><input id="introducer" name="introducer" type="text" size="20" value='${partymem.introducer }'/></td>
  </tr>

  <tr>
    <td width=30%>个人照片:</td>
    <td width=70%><img src="<%=basePath %>${partymem.photo }" width="200px" border="0px"/><br/>
    <input id="avatar" name="avatar" type="file" size="50" /></td>
  </tr>
  <tr>
    <td width=30%>党员状态:</td>
    <td width=70%><input id="status" name="status" type="text" size="20" value='${partymem.status }'/></td>
  </tr>
<tr>
    <td width=30%>奖惩:</td>
    <td width=70%><input id="bonuspenalty" name="bonuspenalty" type="text" size="20" value='${partymem.bonuspenalty }'/></td>
  </tr>
  <tr>
    <td width=30%>评优:</td>
    <td width=70%><input id="appraise" name="appraise" type="text" size="20" value='${partymem.appraise }'/></td>
  </tr>
  <tr>
    <td width=30%>党员备注:</td>
    <td width=70%><textarea id="partymemRemarks" name="partymemRemarks" rows="6" cols="80" value='${partymem.partymemRemarks }'></textarea></td>
  </tr>

  <tr bgcolor='#FFFFFF'>
      <td colspan="4" align="center">
        <input type="submit" value='保存' >
        &nbsp;&nbsp;
        <button type="reset" value='重写' >重写</button>
      </td>
    </tr>

</table>
</form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
