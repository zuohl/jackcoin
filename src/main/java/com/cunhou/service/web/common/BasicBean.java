package com.cunhou.service.web.common;

import java.io.Serializable;

import com.cunhou.service.web.common.util.JsonUtil;

public class BasicBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected static final int DEFAULT_COUNT = 0;

	@Override
	public String toString() {
		return JsonUtil.toJson(this);
	}

}
