<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>当当网注册页面</title>
<link href="css/global.css" rel="stylesheet" type="text/css" />
<link href="css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/register.js"></script>
</head>

<body>
	<div id="header">
		<div id="register_header">
			<div class="register_header_left">
				<img src="images/logo.gif" alt="logo">
			</div>
			<div class="register_header_right">
				<a href="index.html" class="blue">首页</a> | <a href="product.html"
					class="blue">商品展示页</a> | <a href="shopping.html" class="blue">购物车</a>
				| <a href="login.html" class="blue">登录</a>
			</div>
		</div>
	</div>
	<div id="main">
		<div class="register_content">
			<div class="register_top_bg"></div>
			<div class="register_mid_bg">
				<ul>
					<li class="register_mid_left">填写注册信息</li>
					<li class="register_mid_mid">2. 邮箱验证</li>
					<li class="register_mid_right">3. 完成注册</li>
				</ul>
			</div>
			<div class="register_top_bg_mid">
				<div class="register_top_bg_two_left"></div>
				<div class="register_top_bg_two_right"></div>
				<div class="register_title_bg">
					<img src="images/register_pic_02.gif" alt="欢迎注册"><br>您所提供的资料不会做其他用途，敬请安心填写。
				</div>
			</div>
			<div class="register_dotted_bg"></div>
			<div class="register_message">
				<form action="/register.do" method="post" id="myform"
					onSubmit="return checkRegister()">

					<dl class="register_row">
						<dt>用户名：</dt>
						<dd>
							<input id="nickName" type="text" class="register_input" name="userName"
								onFocus="nickNameFocus()" onBlur="nickNameBlur()">
						</dd>
						<dd>
							<div id="nickName_prompt" style="color: red">${message}</div>
						</dd>
					</dl>
					<dl class="register_row">
						<dt>密码：</dt>
						<dd>
							<input id="pwd" type="password" class="register_input" name="userPass"
								onFocus="pwdFocus()" onBlur="pwdBlur()">
						</dd>
						<dd>
							<div id="pwd_prompt"></div>
						</dd>
					</dl>
					<dl class="register_row">
						<dt>电话：</dt>
						<dd>
							<input id="repwd" type="password" class="register_input" name="userTel"
								onFocus="repwdFocus()" onBlur="repwdBlur()">
						</dd>
						<dd>
							<div id="repwd_prompt"></div>
						</dd>
					</dl>
					<dl class="register_row">
						<dt>地址：</dt>
						<dd>
							<input id="email" type="text" class="register_input" name="userAddress"
								onFocus="emailFocus()" onBlur="emailBlur()">
						</dd>
						<dd>
							<div id="email_prompt"></div>
						</dd>
					</dl>
                    <dl class="register_row">
                        <dt>性别：</dt>
                        <dd><input name="user_sex" id="man" type="radio" value="男"> <label for="man">男</label></dd>
                        <dd> <input name="user_sex" id="woman" type="radio" value="女"> <label for="woman">女</label></dd>
                    </dl>

                    <div class="registerBtn"><input id="registerBtn" type="image" src="images/register_btn_out.gif" onMouseOver="btn_over()" onMouseOut="btn_out()"></div>
                </form>
            </div>


        </div>
    </div>
    <!--网站版权部分开始-->
    <div id="footer">
    </div>
</body>
</html>
