<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
%>
<HTML><HEAD><TITLE>修改发展党员</TITLE>
<STYLE type=text/css>
BODY {
	MARGIN-LEFT: 0px; BACKGROUND-COLOR: #ffffff
}
.STYLE1 {color: #ECE9D8}
.label {font-style.:italic; }
.errorLabel {font-style.:italic;  color:red; }
.errorMessage {font-weight:bold; color:red; }
</STYLE>
 <script src="<%=basePath %>calendar.js"></script>
  <script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
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
    var pyr = document.getElementById("incubationPeople").value;
    if(pyr=="") {
        alert('请输入培养人!');
        return false;
    }
    $.post("<%=basePath%>Admin/updateDevelopingPartymem.action",$("#fzdyxModifyForm").serialize(),function(data){
				alert("党员信息更新成功！");
				//window.location.reload();
			});
    return true; 
}
 </script>
</HEAD>
<BODY background="<%=basePath %>images/adminBg.jpg">
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><form action="Fzdy/Fzdy_ModifyFzdy.action" method="post" name="form1" id="fzdyxModifyForm">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%><input id="id" name="id" type="text" value="${developingPartymem.id }" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>机构名称:</td>
    <td width=70%><input id="organizationName" name="organizationName" type="text" size="20" value='${developingPartymem.organizationName }'/></td>
  </tr>

  <tr>
    <td width=30%>姓名:</td>
    <td width=70%><input id="partymemName" name="partymemName" type="text" size="20" value='${developingPartymem.partymemName }'/></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%><select	id="gender" name="gender" value='${developingPartymem.gender }'>
    	<option value="">--请选择--</option>
    	<option value="1">男</option>
    	<option value="0">女</option>
    </select></td>
  </tr>

  <tr>
    <td width=30%>出生日期:</td>
    <td width=70%><input type="text" readonly  id="birthday"  name="birthday" onclick="setDay(this);" value='${developingPartymem.birthday }'/></td>
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
      <select name="nativePlace">
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
    <td width=70%><input id="occupation" name="occupation" type="text" size="20" value='${developingPartymem.occupation }'/></td>
  </tr>

  <tr>
    <td width=30%>培养时间:</td>
    <td width=70%><input type="text" readonly  id="incubationTime"  name="incubationTime" onclick="setDay(this);" value='${developingPartymem.incubationTime }'/></td>
  </tr>

  <tr>
    <td width=30%>培养人:</td>
    <td width=70%><input id="incubationPeople" name="incubationPeople" type="text" size="20" value='${developingPartymem.incubationPeople }'/></td>
  </tr>

  <tr>
    <td width=30%>发展日期:</td>
    <td width=70%><input type="text" readonly  id="developmentDate"  name="developmentDate" onclick="setDay(this);" value='${developingPartymem.developmentDate }'/></td>
  </tr>

  <tr>
    <td width=30%>备注:</td>
    <td width=70%><textarea id="remarks" name="remarks" rows="6" cols="80" value='${developingPartymem.remarks }'></textarea></td>
  </tr>

  <tr bgcolor='#FFFFFF'>
      <td colspan="4" align="center">
       <button type="button" onclick="checkForm()" value='保存' >保存</button>
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
