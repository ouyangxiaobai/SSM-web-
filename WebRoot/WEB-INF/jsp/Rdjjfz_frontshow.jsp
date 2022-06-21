<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   

%>
<HTML><HEAD><TITLE>查看入党积极分子</TITLE>
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
<TABLE align="center" height="100%" cellSpacing=0 cellPadding=0 width="80%" border=0>
  <TBODY>
  <TR>
    <TD align="left" vAlign=top ><form action="" method="post" name="form1">
<table width='100%' cellspacing='1' cellpadding='3'  class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>机构名称:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>姓名:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>性别:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>出生日期:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>民族:</td>
    <td width=70%>
      <select name="rdjjfz.mz.id" disabled>
      
          <option value=''></option>
     
    </td>
  </tr>

  <tr>
    <td width=30%>籍贯:</td>
    <td width=70%>
      <select name="rdjjfz.jg.id" disabled>
      
          <option value=''></option>
     
    </td>
  </tr>

  <tr>
    <td width=30%>文化程度:</td>
    <td width=70%>
      <select name="rdjjfz.whcd.id" disabled>
     
          <option value='' ></option>
    
    </td>
  </tr>

  <tr>
    <td width=30%>职业:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>培养时间:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>培养人:</td>
    <td width=70%></td>
  </tr>

  <tr>
    <td width=30%>照片:</td>
    <td width=70%><img src="<%=basePath %>" width="200px" border="0px"/></td>
  </tr>
  <tr>
    <td width=30%>党员备注:</td>
    <td width=70%></td>
  </tr>

  <tr>
      <td colspan="4" align="center">
        <input type="button" value="返回" onclick="history.back();"/>
      </td>
    </tr>

</table>
</form>
   </TD></TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
