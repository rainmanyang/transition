package com.hxcy.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.hxcy.core.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
