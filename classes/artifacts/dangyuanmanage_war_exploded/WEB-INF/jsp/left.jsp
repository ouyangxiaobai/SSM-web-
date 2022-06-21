<%@ page pageEncoding="gbk" language="java" import="java.sql.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	//basePath = "http://localhost:8080/SalarySystem/"
%>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.STYLE1 {
	font-size: 12px;
	color: #FFFFFF;
}

.STYLE3 {
	font-size: 12px;
	color: #033d61;
}
-->
</style>
<style type="text/css">
.menu_title SPAN {
	FONT-WEIGHT: bold;
	LEFT: 3px;
	COLOR: #ffffff;
	POSITION: relative;
	TOP: 2px
}

.menu_title2 SPAN {
	FONT-WEIGHT: bold;
	LEFT: 3px;
	COLOR: #FFCC00;
	POSITION: relative;
	TOP: 2px
}
</style>
<script>
	//var he=document.body.clientHeight-105;
	var he = document.documentElement.clientHeight;// - 105;
	document.write("<div id=tt style=height:"+he+";overflow:hidden>");
</script>

<table width="165" height="100%" border="0" cellpadding="0"
	cellspacing="0">
	<tr>
		<td height="28" background="images/main_40.gif"><table
				width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="19%">&nbsp;</td>
					<td width="81%" height="20"><span class="STYLE1">管理菜单</span></td>
				</tr>
			</table></td>
	</tr>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu1"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(1)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">党员信息管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu1" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertPartymemInformationPage.action';">添加党员信息</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryPartymemInformation.action';">党员信息管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu2"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(2)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">文件上传</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu2" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>toUpload.action';">视频上传</span></td>
														</tr>
													</table></td>
											</tr>
											
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	<%-- <tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu3"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(3)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">党费信息管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu3"  style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryPartymemDues.action';">添加党费信息</span></td>
														</tr>
													</table></td>
											</tr>
											
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr> --%>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu4"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(4)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">党员流出管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu4"  style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertPartymemOutflowPage.action';">添加党员流出</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryPartymemOutflow.action';">党员流出管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu5"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(5)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">发展党员管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu5"  style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertDevelopingPartymemPage.action';">添加发展党员</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryDevelopingPartymem.action';">发展党员管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu6"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(6)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">入党积极分子管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu6" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertProActivePage.action';">添加入党积极分子</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryProActive.action';">入党积极分子管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	 <tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu7"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(7)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">留言评论管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu7" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Liuyan/LiuyanmanagerPage.action';">留言管理</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Review/showReview.action';">评论管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>

	<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu8"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(8)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">组织生活管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu8" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertOrganizationalLifePage.action';">添加组织生活</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryOrganizationalLife.action';">组织生活管理</span></td>
														</tr>
													</table></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>
<tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu9"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(9)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">公告管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu9" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Notice/addNoticePage.action';">添加公告信息</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Notice/NoticePage.action';">公告信息管理</span></td>
														</tr>
													</table></td>
											</tr>

											



										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr>
	<%-- <tr>
		<td valign="top"><table width="151" border="0" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu9"
						class="menu_title" onMouseOver="this.className='menu_title2';"
						onClick="showsubmenu(9)" onMouseOut="this.className='menu_title';"
						style="cursor:hand"><table width="100%" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">系统参数设置</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu9" style="DISPLAY: none">
						<div class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertNationPage.action';">添加民族信息</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryNation.action';">民族信息管理</span></td>
														</tr>
													</table></td>
											</tr>

											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertNativeplacePage.action';">添加籍贯信息</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryNativeplace.action';">籍贯信息管理</span></td>
														</tr>
													</table></td>
											</tr>


											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/insertEducationPage.action';">添加文化程度</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/QueryEducation.action';">文化程度管理</span></td>
														</tr>
													</table></td>
											</tr>



										</table></td>
								</tr>
								<tr>
									<td height="5"><img src="images/main_52.gif" width="151"
										height="5" /></td>
								</tr>
							</table>
						</div>
					</td>
				</tr>
			</table></td>
	</tr> --%>

	<tr>
		<td><table width="100%" border="0" cellspacing="0"
				cellpadding="0">
				<tr>
					<td height="23" background="images/main_47.gif" id="imgmenu500"
						class="menu_title" onmouseover="this.className='menu_title2';"
						onclick="showsubmenu(500)"
						onmouseout="this.className='menu_title';" style="cursor:hand"><table
							width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="18%">&nbsp;</td>
								<td width="82%" class="STYLE1">系统管理</td>
							</tr>
						</table></td>
				</tr>
				<tr>
					<td background="images/main_51.gif" id="submenu500" style="DISPLAY: none"><div
							class="sec_menu">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td><table width="90%" border="0" align="center"
											cellpadding="0" cellspacing="0">
											
											<tr>
												<td width="16%" height="25"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td width="84%" height="23"><table width="95%"
														border="0" cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><span
																class="STYLE3"
																onclick="javascript:parent.document.getElementById('ContentFrame').src='<%=basePath%>Admin/AdminModifyPage.action';">修改密码</span></td>
														</tr>
													</table></td>
											</tr>
											<tr>
												<td height="23"><div align="center">
														<img src="images/left.gif" width="10" height="10" />
													</div></td>
												<td height="23"><table width="95%" border="0"
														cellspacing="0" cellpadding="0">
														<tr>
															<td height="20" style="cursor:hand"
																onmouseover="this.style.borderStyle='solid';this.style.borderWidth='1';borderColor='#7bc4d3'; "
																onmouseout="this.style.borderStyle='none'"><a href="<%=basePath%>User/exit.action" target="_top"><span
																class="STYLE3"
																>退出系统</span></a></td>
														</tr>
													</table></td>
											</tr>

										</table></td>
								</tr>

							</table>
						</div></td>
				</tr>
			</table></td>
	</tr>

</table>

<script>
	function showsubmenu(sid) {
		whichEl = eval("submenu" + sid);
		imgmenu = eval("imgmenu" + sid);
		if (whichEl.style.display == "none") {
			eval("submenu" + sid + ".style.display=\"\";");
			imgmenu.background = "images/main_47.gif";
		} else {
			eval("submenu" + sid + ".style.display=\"none\";");
			imgmenu.background = "images/main_48.gif";
		}
	}
</script>
