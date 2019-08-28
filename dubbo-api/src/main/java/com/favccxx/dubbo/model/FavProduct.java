package com.favccxx.dubbo.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 产品类
 * @author favccxx
 *
 */
public class FavProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	/**产品代码*/
	private String productCode;

	/**产品名称*/
	private String productName;
	
	/**单价*/
	private BigDecimal price;

	/**数量*/
	private int amount;
	
	/**详情*/
	private String detail;
	
	/**状态*/
	private int status;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	
	
	
}
