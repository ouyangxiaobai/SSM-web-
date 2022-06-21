<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	  <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
	<script type="text/javascript">
	        var value = 0;
function test(){
            var radios = document.getElementsByName("user");
            for(var i=0;i<radios.length;i++){
                if(radios[i].checked == true){
                    value = radios[i].value;
                }
            }
        }
	        function login()
	        {
	           if(document.userLogin.username.value=="")
	           {
	               alert("请输入用户名");
	               return;
	           }
	           if(document.userLogin.password.value=="")
	           {
	               alert("请输入密码");
	               return;
	           }
	           document.userLogin.submit();
	        }
	        function register()
	        {
				$.ajax({
					type: "POST",
					url: "register.action",
					data: {
						username:$("#username").val() ,
						password: $("#password").val()
					},
					dataType: "json",
					success: function(data) {
						window.location.href="main.action";
					}
				});
	        }
	        
	</script>
  </head>
  
  <body>
  <c:if test="${empty sessionScope.username }">
			<form action="<%=path %>/loginCheck.action" name="userLogin" method="post">
			      <table cellspacing="0" cellpadding="0" width="98%" align="center" border="0">
			          <tr>
			            <td align="center" colspan="2" height="10"></td>
			          </tr>
			          <tr>
			            <td align="right" width="31%" height="30" style="font-size: 11px;">用户名：</td>
			            <td align="left" width="69%"><input class="input" id="username" title="用户名不能为空" size="14" name="username" type="text" /></td>
			          </tr>
			          <tr>
			            <td align="right" height="30" style="font-size: 11px;">密　码：</td>
			            <td align="left"><input class="input" id="password" title="密码不能为空" type="password" size="16" name="password"/></td>
			          </tr>
			          <tr>
			            <label>
               <input type="radio" name="user" id="user1" value="普通用户">普通用户
            </label>
            <label>
                <input type="radio" name="user" id="user2"  value="管理员">管理员
            </label>
			          </tr>
			          <tr>
			            <td align="center" colspan="2" height="10"><font color="red">${error}</font></td>
			          </tr>
			          <tr>
			            <td align="center" colspan="2" height="30">
			               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			               <input type="button" value="登  录" onclick="login()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />
							<input type="button" value="注  册" onclick="register()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />

						</td>
						  <%--<td align="center" colspan="2" height="30">--%>
							  <%--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--%>
							  <%--<input type="button" value="注  册" onclick="register()" style="border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;" />--%>

						  <%--</td>--%>
			          </tr>
			      </table>
		    </form>
</c:if>
<c:if test="${!empty sessionScope.username }">
		        <br/>
			     欢迎您：${sessionScope.username } &nbsp;&nbsp;&nbsp;&nbsp;
			    <a href="<%=path %>/User/exit.action">安全退出</a> &nbsp;&nbsp;&nbsp;&nbsp;
			    <br/><br/><br/></c:if>
  </body>
</html>
