<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
	<head>
		<title>demo</title>
		<link href="${ctx}/static/styles/public.css" type="text/css" rel="stylesheet" />
		<link href="${ctx}/static/styles/start/jquery-ui-1.9.1.custom.css" type="text/css" rel="stylesheet" />
		<script src="${ctx}/static/js/jquery-1.8.2.js"></script>
		<script src="${ctx}/static/js/jquery-ui-1.9.1.custom.js"></script>
		<script src="${ctx}/static/js/common.js"></script>
		<script language="javascript">
			var user = null;
			var tabCounter = 1;
			$(function() {
				$.ajaxSetup({cache:false});
				$("body").width(window.screen.width);
				var h = $(window).height() - $("#top").outerHeight(true) - $("#footer").outerHeight(true) - 24;
				$("#menu").height(h);
				$("#main").height(h);
				$("#accordion").accordion({heightStyle: "fill"});
			});
			
			function addTab() {
				
	            var label = "tab"+tabCounter,
	                id = "tabs-" + tabCounter,
	                tabContentHtml = tabContent.val() || "Tab " + tabCounter + " content.";
	 
	            tabs.find( ".ui-tabs-nav" ).append( li );
	            tabs.append( "<div id='" + id + "'><p>" + tabContentHtml + "</p></div>" );
	            tabs.tabs( "refresh" );
	            tabCounter++;
	        }
			
		</script>
	</head>
	<body>
		<div id="left" style="float: left; width: 15%;">
			<div id="menu" class="ui-widget ui-widget-content ui-corner-all" style="margin: .3em 0 0 .3em; padding: .2em;">
				<div id="accordion">
					<h3 style="border: 0; margin: 0;">用户管理</h3>
					<ul style="padding: 0; border: 0;">
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/group.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>组</a>
						</li>
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/user.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>用户</a>
						</li>
					</ul>
					<h3 style="border: 0; margin-top: 1px;">用户管理</h3>
					<ul style="padding: 0; border: 0;">
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/group.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>组</a>
						</li>
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/user.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>用户</a>
						</li>
					</ul>
					<h3 style="border: 0; margin-top: 1px;">用户管理</h3>
					<ul style="padding: 0; border: 0;">
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/group.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>组</a>
						</li>
						<li style="padding: .4em 0; border-bottom: 1px solid #C5C5C5;">
							<a href="javascript: void(0)" onclick="$('#work').attr('src', 'user/user.html');"><span class="ui-icon ui-icon-folder-collapsed" style="float: left;"></span>用户</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div id="right" style="float: left; width: 85%;">
			<div id="tabs" class="ui-widget ui-widget-content ui-corner-all" style="margin: .3em .3em 0 .3em; padding: .2em;">
				<!-- <iframe id="work" style="width: 100%; height: 100%; border: 0px;" src="welcome.html"></iframe> -->
			</div>
		</div>
		<div class="ui-helper-clearfix"></div>
	</body>
</html>
