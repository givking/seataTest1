package com.favccxx.dubbo.req;

public class ProductInSertReq extends AbstractReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	/**产品代码*/
	private String productCode;

	/**产品名称*/
	private String productName;
	
	/**单价*/
	private String price;

	/**数量*/
	private int amount;
	
	/**详情*/
	private String detail;
	
	/**状态*/
	private int status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
