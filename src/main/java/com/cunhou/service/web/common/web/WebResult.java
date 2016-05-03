package com.cunhou.service.web.common.web;

import java.io.Serializable;

import com.cunhou.service.web.common.util.JsonUtil;

/**
 * Web JSON 返回统一对象
 * @author chenmaomao
 * @param <T> 返回Data
 */
public class WebResult<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	private WebResultCode code;
	private int status;
	private String msg;
	private T data;

	public WebResult() {
		super();
	}

	public WebResult(WebResultCode code) {
		super();
		this.code = code;
	}
	
	public WebResult(WebResultCode code, T data) {
		super();
		this.code = code;
		this.data = data;
	}
	
	public WebResult(WebResultCode code, T data, String msg) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public WebResultCode getCode() {
		return code;
	}

	public void setCode(WebResultCode code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return JsonUtil.toJson(this);
	}

}
