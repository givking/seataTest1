package com.favccxx.dubbo.api.user;

import java.math.BigDecimal;

import com.favccxx.dubbo.model.FavUser;

public interface UserService {

//	String findByUsername(String username);
	
	/**
	 * 根据用户名查询用户信息
	 * @param username
	 * @return
	 */
	FavUser findByUsername(String username);
	
	/**
	 * 更新用户账户
	 * @param username
	 * @param amount
	 * @return
	 */
	FavUser updateUser(String username, BigDecimal amount);
}
