package com.favccxx.dubbo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.favccxx.dubbo.service.ProuctBizService;

@RestController
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	ProuctBizService prouctBizService;

//	@RequestMapping("/product")
//	public String product(String productName) {
//		return productService.findByProductName(productName);
//	}
//
//	@RequestMapping("/saveProduct")
//	public String save(ProductInSertReq req) {
//		return JSON.toJSONString(productService.createProduct(req));
//	}

	@RequestMapping("/purchase")
	public String purchase(String username, String productCode, int count) {
		prouctBizService.purchase(username, productCode, count);
		return "";
	}
}
