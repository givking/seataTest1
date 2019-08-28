package com.favccxx.dubbo.service;

import java.math.BigDecimal;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.favccxx.dubbo.api.product.ProductService;
import com.favccxx.dubbo.api.user.UserService;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

@Service
public class ProuctBizServiceImpl implements ProuctBizService {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Reference(version = "1.0.1", check = false, retries = 0)
	ProductService productService;
	@Reference(group = "UserGroup", version = "1.0.2", check = false)
	UserService userService;

	@Override
	@GlobalTransactional(timeoutMills = 300000, name="my_group")
	public void purchase(String username, String productCode, int productCount) {
		
		logger.info("xid: " + RootContext.getXID());
		userService.updateUser(username, (new BigDecimal("22.3")));
		productService.sellProduct(productCode);
		throw new RuntimeException("错误");
	}

}
