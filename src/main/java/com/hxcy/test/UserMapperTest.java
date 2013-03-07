package com.hxcy.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.hxcy.dao.UserMapper;


public class UserMapperTest extends SpringTxTestCase {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFindByLoginName(){
		Assert.notNull(userMapper.findByLoginName("admin"));
	}
}
