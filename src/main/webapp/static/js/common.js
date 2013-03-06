
function showMsg(msg, callback) {
	var _dialog = $("<div title='提示'>" + msg + "</div>");
	_dialog.dialog({
		modal: true,
		buttons: {
			"确定": function() {
				if (callback) {
					callback();
				}
				_dialog.dialog("close");
			}
		},
		close: function() { _dialog.remove(); }
	});
}

function openLogin(callback) {
	
	var _html = "<div title='系统登录'>\
		<table>\
			<tr>\
				<td style='width: 60px; text-align: right;'><label for='__j_username__'>用户名:</label></td>\
				<td><input type='text' id='__j_username__' class='ui-widget-content ui-corner-all' style='padding: .4em .2em;' maxlength='16' /></td>\
			</tr>\
			<tr>\
				<td style='text-align: right;'><label for='__j_password__'>密码:</label></td>\
				<td><input type='password' id='__j_password__' class='ui-widget-content ui-corner-all' style='padding: .4em .2em;' maxlength='16' /></td>\
			</tr>\
		</table>\
	</div>";
	var _dialog = $(_html);
	_dialog.dialog({
		modal: true,
		buttons: {
			"登录": function() {
				var cb = function() {
					if (callback && callback.success) { callback.success(); }
					_dialog.dialog("close");
				};
				login($("#__j_username__").val(), $("#__j_password__").val(), cb);
			},
			"取消": function() { _dialog.dialog("close"); }
		},
		close: function() {
			_dialog.remove();
			if (callback && callback.cancel) { callback.cancel(); }
		}
	});
}

function login(username, password, callback) {
	$.ajax({
		url: "j_security_check",
		type: "POST",
		data: {j_username: username, j_password: password},
		success: function(data) { if (callback) { callback(); } },
		error: function(response) { showMsg($.parseJSON($.trim(response.responseText)).message); }
	});
}

function logout(callback) {
	var _dialog = $("<div title='操作确认'>确定要退出吗?</div>");
	_dialog.dialog({
		modal: true,
		buttons: {
			"确定": function() {
				$.ajax({
					url: "j_security_logout",
					success: function(data) { if (callback) { callback(); } else { location.reload(); } },
					error: function(response) { showMsg($.parseJSON($.trim(response.responseText)).message); }
				});
			},
			"取消": function() { _dialog.dialog("close"); }
		},
		close: function() { _dialog.remove(); }
	});
}
