package com.hxcy.core.data;

import org.springside.modules.test.data.RandomData;

import com.hxcy.core.entity.Task;
import com.hxcy.core.entity.User;

/**
 * Task相关实体测试数据生成.
 * 
 * @author calvin
 */
public class TaskData {

	public static Task randomTask() {
		Task task = new Task();
		task.setTitle(randomTitle());
		User user = new User(1L);
		task.setUser(user);
		return task;
	}

	public static String randomTitle() {
		return RandomData.randomName("Task");
	}
}
