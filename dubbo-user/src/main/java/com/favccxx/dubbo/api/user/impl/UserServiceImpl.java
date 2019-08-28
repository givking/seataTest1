package com.favccxx.dubbo.api.user.impl;

import java.math.BigDecimal;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.favccxx.dubbo.api.user.UserService;
import com.favccxx.dubbo.mapper.UserMapper;
import com.favccxx.dubbo.model.FavUser;

@Service(group = "UserGroup", version = "1.0.2")
@Component
public class UserServiceImpl  extends ServiceImpl<UserMapper, FavUser> implements UserService {

//	@Autowired
//	UserMapper baseMapper;
	

	@Override
	public FavUser findByUsername(String username) {
		QueryWrapper<FavUser> wrapper = new QueryWrapper<FavUser>();
		wrapper.eq("username", username);
		FavUser user = baseMapper.selectOne(wrapper);
		return user;
	}

	@Override
	public FavUser updateUser(String username, BigDecimal amount) {
		QueryWrapper<FavUser> wrapper = new QueryWrapper<FavUser>();
		wrapper.eq("username", username);
		FavUser user = baseMapper.selectOne(wrapper);
		if(user != null) {
			user.setAmount(user.getAmount().subtract(amount));
		}
		baseMapper.updateById(user);
		return user;
	}

}
