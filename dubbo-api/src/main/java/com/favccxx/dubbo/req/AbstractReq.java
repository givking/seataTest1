package com.favccxx.dubbo.req;

import java.io.Serializable;

/**
 * 抽象类接口
 * 存放API认证的参数
 * @author favccxx
 *
 */
public abstract class AbstractReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * Token令牌
	 */
	private String token;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
}
