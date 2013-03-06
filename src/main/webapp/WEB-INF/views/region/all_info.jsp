<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp"%>
<script src="../static/js/jquery-1.8.2.js"></script>
<script src="../static/js/jquery-ui-1.9.1.custom.js"></script>
<script src="../static/js/jquery.tmpl.js"></script>
<html>
<head>
	<title>片区详细信息</title>
	<link rel="stylesheet" href="../static/styles/public.css" />
	<link rel="stylesheet" href="../static/styles/start/jquery-ui-1.9.1.custom.css" />
</head>

<body>
	<div style="margin: .1em;">
		<table id="contentTable" class="table table-striped table-bordered table-condensed">
			<thead><tr class="ui-widget-header"><th>名称</th><th>描述</th><th>编码</th><th>操作</th></tr></thead>
			<tbody>
			<c:forEach items="${regionList}" var="region">
				<tr>
					<td><a href="${ctx}/region/toUpdate/${region.id}" id="dialog_link" class="ui-state-default ui-corner-all">${region.name}</a></td>
					<td>${region.description}</td>
					<td>
						${region.code}
					</td>
					<td><a href="${ctx}/region/delete/${region.id}">删除</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>