<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String username=(String)session.getAttribute("username");
    /* if(username==null){
        response.getWriter().println("<script>top.location.href='" + basePath + "login/login_view.action';</script>");
    } */
%>
<c:set var="cxtPath" value="${pageContext.request.contextPath}"></c:set>
<HTML><HEAD><TITLE>添加组织生活</TITLE> 
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
<script type="text/javascript" src="<%=basePath %>js/jquery.js"></script>
<script type="text/javascript" src="${cxtPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${cxtPath}/js/plupload.full.min.js"></script>
<script type="text/javascript" src="${cxtPath}/js/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="${cxtPath}/js/zh_CN.js"></script>
<link href="${cxtPath}/css/jquery.plupload.queue.css" rel='stylesheet' type='text/css' />
<script language="javascript">
/*验证表单*/
function checkForm() {
    var zzdw = document.getElementById("organizationalUnit").value;
    if(zzdw=="") {
        alert('请输入组织单位!');
        return false;
    }
    var hdmc = document.getElementById("activityName").value;
    if(hdmc=="") {
        alert('请输入活动名称!');
        return false;
    }
    var fzr = document.getElementById("personCharge").value;
    if(fzr=="") {
        alert('请输入负责人!');
        return false;
    }
    var dd = document.getElementById("place").value;
    if(dd=="") {
        alert('请输入地点!');
        return false;
    }
    /* var nr = document.getElementById("activityContent").value;
    if(nr=="") {
        alert('请输入内容!');
        return false;
    } */
    $.post("<%=basePath%>Admin/insertOrganizationalLife.action",$("#zzshAddForm").serialize(),function(data){
				alert("活动信息更新成功！");
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
    <form action="Zzsh/Zzsh_AddZzsh.action" method="post" id="zzshAddForm" name="form1">
<table width='100%' cellspacing='1' cellpadding='3' class="tablewidth">

  <tr>
    <td width=30%>组织单位:</td>
    <td width=70%><input id="organizationalUnit" name="organizationalUnit" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>活动名称:</td>
    <td width=70%><input id="activityName" name="activityName" type="text" size="30" /></td>
  </tr>

  <tr>
    <td width=30%>负责人:</td>
    <td width=70%><input id="personCharge" name="personCharge" type="text" size="20" /></td>
  </tr>

  <tr>
    <td width=30%>时间:</td>
    <td width=70%><input type="text" readonly id="activityTime"  name="activityTime" onclick="setDay(this);"/></td>
  </tr>

  <tr>
    <td width=30%>地点:</td>
    <td width=70%><input id="place" name="place" type="text" size="50" /></td>
  </tr>

  <tr>
    <td width=30%>参加人数:</td>
    <td width=70%><input id="peoplenumber" name="peoplenumber" type="text" size="8" /></td>
  </tr>


  <tr>
  
    <td width=30%>内容:</td>
    <td width=70%>
    <br>
    <br>
    <div class="container">
		<div class="container_wrap">
			
				<div class="clearfix"></div>
			</div>

			<div class="content" style="margin-top: -5%">
				<div class="content">
					<div class="register">
    <div id="uploader">
							<p>Your browser doesn't have Flash, Silverlight or HTML5 support.</p>
						</div>
						
						</div>
				</div>
			</div>
		</div>
	
						</td>
  </tr>

  <tr>
    <td width=30%>备注:</td>
    <td width=70%><textarea id="remarks" name="remarks" rows="6" cols="80"></textarea></td>
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
<script type="text/javascript">
		$(function() {
			// Initialize the widget when the DOM is ready  
			var uploader = $("#uploader").pluploadQueue({
				// General settings  
				runtimes : 'html5,flash,silverlight,html4,jsp',
				url : "../toUpload/pluploadUpload2.action",

				// Maximum file size  
				max_file_size : '10000mb',

				chunk_size : '1mb',

				// Resize images on clientside if we can  
				resize : {
					width : 200,
					height : 200,
					quality : 90,
					crop : true
				// crop to exact dimensions  
				},

				// Specify what files to browse for  
				filters : [ {
					title : "Image files",
					extensions : "jpg,gif,png"
				}, {
					title : "Vedio files",
					extensions : "mp4,mkv,qsv"
				}, {
					title : "Zip files",
					extensions : "zip,avi"
				},{
					title : "word files",
					extensions : "doc,docx"
				} ],

				// Rename files by clicking on their titles  
				rename : true,

				// Sort files  
				sortable : true,

				// Enable ability to drag'n'drop files onto the widget (currently only HTML5 supports that)  
				dragdrop : true,

				// Views to activate  
				views : {
					list : true,
					thumbs : true, // Show thumbs  
					active : 'thumbs'
				},

				// Flash settings  
				flash_swf_url : 'js/Moxie.swf',

				// Silverlight settings  
				silverlight_xap_url : 'js/Moxie.xap'
			});

			$("#toStop").on('click', function() {
				uploader.stop();
			});

			$("#toStart").on('click', function() {
				uploader.start();
			});
		});
	</script>
</BODY>
</HTML>
