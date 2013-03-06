<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="top">
	<div class="ui-widget ui-widget-content ui-corner-all" style="background-image: url(${ctx}/static/images/top-bg.gif); margin: .3em .3em 0 .3em;">
		<img style="font-weight: bold;" src="${ctx}/static/images/logo.png" />
		<div id="user-label" style="display: none; float: right; padding: .4em;">
			<shiro:user>
			<div class="btn-group pull-right" style="float: left;">
				<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
					<i class="icon-user"></i> <shiro:principal property="name"/>
					<span class="caret"></span>
				</a>
			
				<ul class="dropdown-menu">
					<shiro:hasRole name="admin">
						<li><a href="${ctx}/admin/user">Admin Users</a></li>
						<li class="divider"></li>
					</shiro:hasRole>
					<li><a href="javascript: editUserInfo();">修改资料</a></li>
					<li><a href="javascript: changePassword();">修改密码 </a></li>
					<li><a href="${ctx}/logout">退出</a></li>
				</ul>
			</div>
			</shiro:user>
		</div>
		
	</div>
</div>