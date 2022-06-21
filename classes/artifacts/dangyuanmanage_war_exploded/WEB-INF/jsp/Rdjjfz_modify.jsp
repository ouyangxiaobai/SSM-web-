<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
    String username=(String)session.getAttribute("username");
    /* if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    } */
%>
<HTML><HEAD><TITLE>修改入党积极分子</TITLE>
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
   // $.post("<%=basePath%>Admin/updateBProActive.action",$("#rdjjModifyForm").serialize(),function(data){
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
    <form action="updateBProActive.action" method="post" name="form1" id="rdjjModifyForm" enctype="multipart/form-data" onsubmit="return checkForm()">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%><input id="id" name="id" type="text" value="${proActive.id }" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>机构名称:</td>
    <td width=70%><input id="organizationName" name="organizationName" type="text" size="20" value='${proActive.organizationName }'/></td>
  </tr>

  <tr>
    <td width=30%>姓名:</td>
    <td width=70%><input id="partymemName" name="partymemName" type="text" size="20" value='${proActive.partymemName }'/></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%><select	id="gender" name="gender" value='${partymem.gender }'>
    	<option value="">--请选择--</option>
    	<option value="1">男</option>
    	<option value="0">女</option>
    </select></td>
  </tr>

  <tr>
    <td width=30%>出生日期:</td>
    <td width=70%><input type="text" readonly  id="birthday"  name="birthday" onclick="setDay(this);" value='${proActive.birthday }'/></td>
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
    <td width=70%><input id="occupation" name="occupation" type="text" size="20" value='${proActive.occupation }'/></td>
  </tr>

  <tr>
    <td width=30%>培养时间:</td>
    <td width=70%><input type="text" readonly  id="incubationTime"  name="incubationTime" onclick="setDay(this);" value='${proActive.incubationTime }'/></td>
  </tr>

  <tr>
    <td width=30%>培养人:</td>
    <td width=70%><input id="incubationPeople" name="incubationPeople" type="text" size="20" value='${proActive.incubationPeople }'/></td>
  </tr>

  <tr>
    <td width=30%>照片:</td>
    <td width=70%><img src="<%=basePath %>${proActive.photo }" width="200px" border="0px"/><br/>
   
    <input id="avatar" name="avatar" type="file" size="50" /></td>
  </tr>
  <tr>
    <td width=30%>党员备注:</td>
    <td width=70%><textarea id="remarks" name="remarks" rows="6" cols="80" value='${proActive.remarks }'></textarea></td>
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
