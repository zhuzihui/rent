<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8" />
<title>青鸟租房 - 用户登录</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/function.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
</head>
<body>


	<div id="header" class="wrap">
		<div id="logo">
			<img src="images/logo.gif" />
		</div>
	</div>
	<div id="regLogin" class="wrap">
		<div class="dialog">
			<div class="box">
				<h4>用户登录</h4>
				<form id="User_login_action" name="User_login_action">
					<div class="infos">
						<table class="field">
							<tr>
								<td colspan="2" style="text-align: center; color: red"></td>
							</tr>
							<tr>
								<td class="field">用 户 名：</td>
								<td><input type="text" name="u_name" value=""
									id="User_login_action_username" class="text" required="true" />
								</td>
							</tr>
							<tr>
								<td class="field">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
								<td><input type="password" name="u_password"
									id="User_login_action_password" class="text" required="true" />
								</td>
							</tr>
							<!-- <tr>
							<td class="field">验 证 码：</td>
							<td><input type="text" class="text verycode" name="veryCode" /></td>
						</tr> -->
							
						</table>
					
						
					</div>
					
				</form>
						<div class="buttons">
							<input type="button" onclick="submit()" value="立即登录" /> 
							<!-- <input type="button" id="login" value="立即登录" />	不知道为啥这样写调用不到  -->
							<input type='button' value='注册' onclick='document.location="register.html"' />
						</div>




			</div>
		</div>
	</div>
	<div id="footer" class="wrap">
		<dl>
			<dt>青鸟租房 &copy; 2015 源辰信息科技有限公司 湘ICP证1000001号</dt>
			<dd>关于我们 · 联系方式 · 意见反馈 · 帮助中心</dd>
		</dl>
	</div>

<script type="text/javascript">
	function submit(){
		//debugger;
		/* 这个判断为啥没用？？？？？？？？？？？ */
		var uname=document.forms[0].elements["u_name"].value;
		var password=document.forms[0].elements["u_password"].value;
		if(uname.trim()==null){
			alert("用户名不能为空");
			return;
		}
		if(password==null){
			alert("密码不能为空！");
			return;
		}
		
		
		$.ajax({
			url:"login",
			method:"POST",
			data:$("#User_login_action").serialize(),
			dataType:"JSON",
			success:function(data){
				alert("ajax进来了");
				if(data.code==1){
					alert("恭喜，登录成功..正在跳转");
					window.location.href="list.html";
				}else{
					alert("登录失败:"+data.msg);
					window.location.href="index.jsp";
				}
			}
		});
	}
</script>


	<!-- <script type="text/javascript">
	
	/* 		没用   			 */
		$(function() {
			alert("========");
			$("#login").click(function() {
				
			});
		})
	</script> -->
</body>
</html>