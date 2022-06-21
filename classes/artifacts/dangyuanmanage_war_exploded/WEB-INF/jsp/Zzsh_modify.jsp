<%@ page language="java" import="java.util.*"  contentType="text/html;charset=utf-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
/*     String username=(String)session.getAttribute("username");
    if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    } */
%>
<HTML><HEAD><TITLE>修改组织生活</TITLE>
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
    var zzdw = document.getElementById("zzsh.zzdw").value;
    if(zzdw=="") {
        alert('请输入组织单位!');
        return false;
    }
    var hdmc = document.getElementById("zzsh.hdmc").value;
    if(hdmc=="") {
        alert('请输入活动名称!');
        return false;
    }
    var fzr = document.getElementById("zzsh.fzr").value;
    if(fzr=="") {
        alert('请输入负责人!');
        return false;
    }
    var dd = document.getElementById("zzsh.dd").value;
    if(dd=="") {
        alert('请输入地点!');
        return false;
    }

    $.post("<%=basePath%>Admin/updateOrganizationalLife.action",$("#zzshModifyForm").serialize(),function(data){
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
    <TD align="left" vAlign=top >
    <form action="Zzsh/Zzsh_ModifyZzsh.action" method="post" name="form1" id="zzshModifyForm">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">
  <tr>
    <td width=30%>记录编号:</td>
    <td width=70%><input id="zzsh.id" name="id" type="text" value="${organizationalLife.id }" readOnly /></td>
  </tr>

  <tr>
    <td width=30%>组织单位:</td>
    <td width=70%><input id="zzsh.zzdw" name="organizationalUnit" type="text" size="20" value='${organizationalLife.organizationalUnit }'/></td>
  </tr>

  <tr>
    <td width=30%>活动名称:</td>
    <td width=70%><input id="zzsh.hdmc" name="activityName" type="text" size="30" value='${organizationalLife.activityName }'/></td>
  </tr>

  <tr>
    <td width=30%>负责人:</td>
    <td width=70%><input id="zzsh.fzr" name="personCharge" type="text" size="20" value='${organizationalLife.personCharge }'/></td>
  </tr>

  <tr>
    <td width=30%>时间:</td>
    <td width=70%><input type="text" readonly  id="zzsh.sj"  name="activityTime" onclick="setDay(this);" value='${organizationalLife.activityTime }'/></td>
  </tr>

  <tr>
    <td width=30%>地点:</td>
    <td width=70%><input id="zzsh.dd" name="place" type="text" size="50" value='${organizationalLife.place }'/></td>
  </tr>

  <tr>
    <td width=30%>参加人数:</td>
    <td width=70%><input id="zzsh.cjrs" name="peoplenumber" type="text" size="8" value='${organizationalLife.peoplenumber }'/></td>
  </tr>

  <tr>
    <td width=30%>备注:</td>
    <td width=70%><textarea id="zzsh.bz" name="remarks" rows="6" cols="80" value='${organizationalLife.remarks }'></textarea></td>
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
