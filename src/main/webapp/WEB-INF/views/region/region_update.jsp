<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp"%>

<html>
<head>
	<title>用户管理</title>
	
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#regioninputForm").validate();
		});
	</script>
</head>

<body>
	<form id="regioninputForm" action="${ctx}/region/update" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${region.id}"/>
		<fieldset>
			<legend><small>片区管理</small></legend>
			<div class="control-group">
				<label class="control-label">片区名称:</label>
				<div class="controls">
					<input type="text" id="name" name="name" value="${region.name}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">片区描述:</label>
				<div class="controls">
					<input type="text" id="description" name="description" value="${region.description}"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">片区编码:</label>
				<div class="controls">
					<input type="text" id="code" name="code" value="${region.code}" class="input-large required"/>
				</div>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
</body>
</html>
