package com.favccxx.dubbo.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户表
 * 
 * @author favccxx
 *
 */
public class FavUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键id */
	private Long id;

	/** 用户名 */
	private String username;

	/** 密码 */
	private String password;

	/** 状态 */
	private int status;

	/** 账户金额 */
	private BigDecimal amount;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

}
