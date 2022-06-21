<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
%>
<HTML><HEAD><TITLE>查看组织生活</TITLE>
<STYLE type=text/css>
body{margin:0px; font-size:12px; background-image:url(<%=basePath%>images/bg.jpg); background-position:bottom; background-repeat:repeat-x; background-color:#A2D5F0;}
.STYLE1 {color: #ECE9D8}
.label {font-style.:italic; }
.errorLabel {font-style.:italic;  color:red; }
.errorMessage {font-weight:bold; color:red; }
</STYLE>
 <script src="<%=basePath %>calendar.js"></script>
</HEAD>
<BODY><br/><br/>
<s:fielderror cssStyle="color:red" />
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><s:form action="" method="post" onsubmit="return checkForm();" enctype="multipart/form-data" name="form1">
<table width='100%' cellspacing='1' cellpadding='3'  class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>组织单位:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>活动名称:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>负责人:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>时间:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>地点:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>参加人数:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>内容:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>备注:</td>
    <td width=70%></td>
  </tr>

  <tr>
      <td colspan="4" align="center">
        <input type="button" value="返回" onclick="history.back();"/>
      </td>
    </tr>

</table>
</s:form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
