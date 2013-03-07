package com.hxcy.dao;

import com.hxcy.entity.user;
import com.hxcy.entity.userExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    
	user findByLoginName(String name);
	
	user selectByPrimaryKey(BigDecimal id);
}