package com.favccxx.dubbo.api.product.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.favccxx.dubbo.api.product.ProductService;
import com.favccxx.dubbo.mapper.ProductMapper;
import com.favccxx.dubbo.model.FavProduct;
import com.favccxx.dubbo.req.ProductInSertReq;

@Service(version="1.0.1")
@Component
public class ProductServiceImpl  implements ProductService {
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public FavProduct createProduct(ProductInSertReq req) {
		FavProduct product = new FavProduct();
		BeanUtils.copyProperties(req, product);
		product.setPrice(new BigDecimal(req.getPrice()));
		productMapper.insert(product);
		return product;
	}

	@Override
	public List<FavProduct> findProducts(FavProduct favProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sellProduct(String productCode) {
		QueryWrapper<FavProduct> wrapper = new QueryWrapper<FavProduct>();
		wrapper.eq("product_code", productCode);
		FavProduct product = productMapper.selectOne(wrapper);
		if(product != null) {
			product.setAmount(product.getAmount() - 1);
			productMapper.updateById(product);
		}
		
	}

	

}
