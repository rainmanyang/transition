<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>登录页</title>
	<script>
		$(document).ready(function() {
			$("body").width(window.screen.width);
			var h = $(window).height() - $("#top").outerHeight(true) - $("#footer").outerHeight(true) - 24;
			$("#content").height(h);
			var l_form = ($(window).width()-$("#loginform").outerWidth(true))/2
			var t_form = ($(window).height()-$("#loginform").outerHeight(true))/2
			$("#loginform").position = 'absolute';
			$("#loginform").left = l_form+'px';
			$("#loginform").top = t_form+'px';
		});
	</script>
</head>

<body>
	<div id="loginform" style="margin-top: 15%;margin-right: 20%;margin-bottom: 10%;margin-left: 26%;overflow:hidden">
			<form id="loginForm" action="${ctx}/login" method="post" class="form-horizontal" style="width:500px">
			<%
			String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
			if(error != null){
			%>
				<div class="alert alert-error input-medium controls">
					<button class="close" data-dismiss="alert">×</button>登录失败，请重试.
				</div>
			<%
			}
			%>
				<div class="control-group">
					<label for="username" class="control-label">名称:</label>
					<div class="controls">
						<input type="text" id="username" name="username"  value="${username}" class="input-medium required"/>
					</div>
				</div>
				<div class="control-group">
					<label for="password" class="control-label">密码:</label>
					<div class="controls">
						<input type="password" id="password" name="password" class="input-medium required"/>
					</div>
				</div>
						
				<div class="control-group">
					<div class="controls">
						<label class="checkbox" for="rememberMe"><input type="checkbox" id="rememberMe" name="rememberMe"/> 记住我</label>
						<input id="submit_btn" class="btn btn-primary" type="submit" value="登录"/> <a class="btn" href="${ctx}/register">注册</a>
					 	<span class="help-block">(管理员: <b>admin/admin</b>, 普通用户: <b>user/user</b>)</span>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
