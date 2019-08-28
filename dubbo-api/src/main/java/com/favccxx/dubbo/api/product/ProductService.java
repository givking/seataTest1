package com.favccxx.dubbo.api.product;

import java.util.List;

import com.favccxx.dubbo.model.FavProduct;
import com.favccxx.dubbo.req.ProductInSertReq;

public interface ProductService {

	/**
	 * 创建产品
	 * @param req
	 * @return
	 */
	FavProduct createProduct(ProductInSertReq req);
	
	/**
	 * 查询产品列表
	 * @return
	 */
	List<FavProduct> findProducts(FavProduct favProduct);

	String findByProductName(String productName);
	
	/**
	 * 卖掉一个产品
	 * @param productCode
	 */
	void sellProduct(String productCode);

}
