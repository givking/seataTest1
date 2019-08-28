package com.favccxx.dubbo.controller;

import java.math.BigDecimal;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.favccxx.dubbo.api.product.ProductService;
import com.favccxx.dubbo.api.user.UserService;

@RestController
public class UserController {

	@Reference(group = "UserGroup", version = "1.0.2", check = false)
	UserService userService;
	@Reference(version = "1.0.1", check = false, retries = 0)
	ProductService productService;
	

	@RequestMapping("/hello")
	public String hello(String username) {
		return JSON.toJSONString(userService.findByUsername(username));
	}
	
	@RequestMapping("/buy")
	public String buy(String username, String productCode) {
		userService.updateUser(username, (new BigDecimal("22.3")));
		productService.sellProduct(productCode);
		return "";
	}

}
