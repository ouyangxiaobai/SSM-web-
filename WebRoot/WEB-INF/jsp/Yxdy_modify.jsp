<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
    String username=(String)session.getAttribute("username");
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    }
%>
<HTML><HEAD><TITLE>修改优秀党员</TITLE>
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
<script language="javascript">
/*验证表单*/
function checkForm() {
    var jgmc = document.getElementById("yxdy.jgmc").value;
    if(jgmc=="") {
        alert('请输入机构名称!');
        return false;
    }
    var xm = document.getElementById("yxdy.xm").value;
    if(xm=="") {
        alert('请输入姓名!');
        return false;
    }
    var xb = document.getElementById("yxdy.xb").value;
    if(xb=="") {
        alert('请输入性别!');
        return false;
    }
    return true; 
}
 </script>
</HEAD>
<BODY background="<%=basePath %>images/adminBg.jpg">
<s:fielderror cssStyle="color:red" />
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><s:form action="Yxdy/Yxdy_ModifyYxdy.action" method="post" onsubmit="return checkForm();" enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%><input id="yxdy.id" name="yxdy.id" type="text" value="" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>机构名称:</td>
    <td width=70%><input id="yxdy.jgmc" name="yxdy.jgmc" type="text" size="20" value=''/></td>
  </tr>

  <tr>
    <td width=30%>姓名:</td>
    <td width=70%><input id="yxdy.xm" name="yxdy.xm" type="text" size="20" value=''/></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%><input id="yxdy.xb" name="yxdy.xb" type="text" size="3" value=''/></td>
  </tr>

  <tr>
    <td width=30%>出生日期:</td>
    <td width=70%><input type="text" readonly  id="yxdy.csrq"  name="yxdy.csrq" onclick="setDay(this);" value=''/></td>
  </tr>

  <tr>
    <td width=30%>民族:</td>
    <td width=70%>
      <select name="yxdy.mz.id">
      
          <option value='' ></option>
     
    </td>
  </tr>

  <tr>
    <td width=30%>照片:</td>
    <td width=70%><img src="<%=basePath %>" width="200px" border="0px"/><br/>
    <input type="hidden" name="yxdy.zp" value="" />
    <input id="zpFile" name="zpFile" type="file" size="50" /></td>
  </tr>
  <tr>
    <td width=30%>评选日期:</td>
    <td width=70%><input type="text" readonly  id="yxdy.pxrq"  name="yxdy.pxrq" onclick="setDay(this);" value=''/></td>
  </tr>

  <tr>
    <td width=30%>评选单位:</td>
    <td width=70%><input id="yxdy.pxdw" name="yxdy.pxdw" type="text" size="20" value=''/></td>
  </tr>

  <tr>
    <td width=30%>主要事迹:</td>
    <td width=70%><textarea id="yxdy.zysj" name="yxdy.zysj" rows="6" cols="80"></textarea></td>
  </tr>

  <tr bgcolor='#FFFFFF'>
      <td colspan="4" align="center">
        <input type='submit' name='button' value='保存' >
        &nbsp;&nbsp;
        <input type="reset" value='重写' />
      </td>
    </tr>

</table>
</s:form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
