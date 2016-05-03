package com.cunhou.service.web.common;

import java.util.List;

import com.cunhou.service.web.exception.YuehouServiceException;


public interface BaseService<T extends BasicBean> {

	/**
	 * 返回所有数据
	 */
	public List<T> findAll();

	public int delete(String id) throws YuehouServiceException;

	public int update(T t) throws YuehouServiceException;

	public T findById(String id);

	public int add(T t) throws YuehouServiceException;

	/**
	 * 返回分页后的数据
	 * 
	 * @param pageView
	 * @param t
	 * @return
	 */
	public PageView findPage(PageView pageView, T t);
}
