<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="cxtPath" value="${pageContext.request.contextPath}"></c:set>
<html>

<head>
<title>视频上传</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="在线视频网站" />
<link href="${cxtPath}/css/indexMovie.css" rel='stylesheet'
	type='text/css' />
<link href="${cxtPath}/css/bootstrap.css" rel='stylesheet'
	type='text/css' />
<link href="${cxtPath}/css/style2.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="${cxtPath}/js/jquery-1.11.1.min.js"></script>
<script src="${cxtPath}/js/responsiveslides.min.js"></script>
<script type="text/javascript" src="${cxtPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${cxtPath}/js/plupload.full.min.js"></script>
<script type="text/javascript" src="${cxtPath}/js/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="${cxtPath}/js/zh_CN.js"></script>
<link href="${cxtPath}/css/jquery.plupload.queue.css" rel='stylesheet' type='text/css' />
</head>

<body>
	<div class="container">
		<div class="container_wrap">
			
				<div class="clearfix"></div>
			</div>

			<div class="content" style="margin-top: -5%">
				<div class="content">
					<div class="register">
						<h3 align="center">
							<font color="#FFFFFF" size="7">上传视频</font>
						</h3>
						<div id="uploader">
							<p>Your browser doesn't have Flash, Silverlight or HTML5 support.</p>
						</div>
						<form method="post" action="${cxtPath}/updateMovie.action"
							enctype="multipart/form-data">
							<div class="register-top-grid">
							<%-- <input type="text" name="userId" value="${user.id}"/> --%>
								<div>
									<span><font color="#FFFFFF" size="4">缩略图</font><label></label></span>
									<input type="file" name="moviePicture" />
								</div>
								<div>
									<span><font color="#FFFFFF" size="4">名称</font><label></label></span>
									<input type="text" name="movieName" placeholder="请输入视频名称">
								</div>
								<div>
									<span><font color="#FFFFFF" size="4">时长</font><label></label></span>
									<input type="text" name="options" placeholder="请输入视频时长">
								</div>

								
								<div>
									<span><font color="#FFFFFF" size="4">描述/简介</font><label></label></span>
									<input type="text" name="message" placeholder="请输入视频描述/简介">
								</div>
								
								<div class="clearfix"></div>
							</div>
							<div class="clearfix"></div>
							<div class="register-but" align="center">
								<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
									type="reset" value="重置">
								<div class="clearfix"></div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		$(function() {
			// Initialize the widget when the DOM is ready  
			var uploader = $("#uploader").pluploadQueue({
				// General settings  
				runtimes : 'html5,flash,silverlight,html4,jsp',
				url : "toUpload/pluploadUpload.action",

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
	
</body>

</html>