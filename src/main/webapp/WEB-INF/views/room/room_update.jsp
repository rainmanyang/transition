<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/common/taglibs.jsp"%>

<html>
<head>
	<title>机房管理</title>
	
	<script>
		$(document).ready(function() {
			//聚焦第一个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#roomInputForm").validate();
		});
	</script>
</head>

<body>
	<form id="roomInputForm" action="${ctx}/room/update" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>机房管理</small></legend>
			<div class="control-group">
				<label class="control-label">机房编号:</label>
				<div class="controls">
					<input type="text" id="sn" name="sn" value="${room.sn}" readonly="readonly"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房名称:</label>
				<div class="controls">
					<input type="text" id="name" name="name" value="${room.name}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房备注:</label>
				<div class="controls">
					<input type="text" id="remark" name="remark" value="${room.remark}"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房责任人:</label>
				<div class="controls">
					<input type="text" id="responsible" name="responsible" value="${room.responsible}" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房类型:</label>
				<div class="controls">
					<input type="text" id="type" name="type" value="${room.type}" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房所属区域:</label>
				<div class="controls">
					<select id="region.id" name="region.id">
						<c:forEach items="${regionList}" var="region">
							<c:choose>
								<c:when test="${room.region.id == region.id}">
									<option selected="selected" value="${region.id }">${region.name }</option>
								</c:when>
								<c:otherwise>
									<option value="${region.id }">${region.name }</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">机房失效采集器个数:</label>
				<div class="controls">
					<input type="text" id="inactive_collectors" name="inactive_collectors" value="${room.inactive_collectors}" />
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
