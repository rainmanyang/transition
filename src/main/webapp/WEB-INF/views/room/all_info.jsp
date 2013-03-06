<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Cache-Control" content="no-cache" />
		<title>机房详细信息</title>
		<link rel="stylesheet" href="../static/styles/public.css" />
		<link rel="stylesheet" href="../static/styles/start/jquery-ui-1.9.1.custom.css" />
	</head>
	<body>
		<div style="margin: .1em; padding: .4em;">
			<label for="email">编号:</label>
			<input type="text" name="email" id="email" class="ui-widget-content ui-corner-all" style="width:150px;" />
			<label for="email">名称:</label>
			<input type="text" name="email" id="email" class="ui-widget-content ui-corner-all" style="width:150px;" />
			<label for="email">区域:</label>
			<select id="status" class="ui-widget-content ui-corner-all" size="" style="width:95px;">
				<option value="">-请选择-</option>
				<option value="1">洪山区</option>
				<option value="2">江夏区</option>
				<option value="2">青山区</option>
			</select>
			<button><span class="ui-icon ui-icon-search" style="float:left;"></span>查询</button>
		</div>
		<div style="margin: .1em;">
		<table class="tab ui-widget ui-widget-content ui-corner-all">
			<thead>
				<tr class="ui-widget-header">
					<th>编号</th>
					<th>名称</th>
					<th>备注</th>
					<th>责任人</th>
					<th>类型 </th>
					<th>区域</th>
					<th>失效采集器个数</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomList}" var="room">
					<tr align="center">
						<td>${room.sn }</td>
						<td><a href="${ctx}/room/toUpdate/${room.sn}.jhtml" id="dialog_link" class="ui-state-default ui-corner-all">${room.name}</a></td>
						<td>${room.remark}</td>
						<td>${room.responsible}</td>
						<td>${room.type}</td>
						<td>
							<c:forEach items="${regionList}" var="region">
								<c:if test="${room.region.id == region.id}">
									${region.name}
								</c:if>
							</c:forEach>
						</td>
						<td>${room.inactive_collectors}</td>
						<td><a href="${ctx}/room/delete/${room.sn}">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</body>
</html>
<script src="../static/js/jquery-1.8.2.js"></script>
<script src="../static/js/jquery-ui-1.9.1.custom.js"></script>
<script src="../static/js/jquery.tmpl.js"></script>
<script language="javascript">
	$("button").button();
</script>

<script id="gridTmpl" type="text/x-jquery-tmpl">
<tr>
	<td>1</td>
	<td>2</td>
	<td>3</td>
	<td>4</td>
</tr>
</script>