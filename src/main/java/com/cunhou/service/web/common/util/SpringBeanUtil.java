package com.cunhou.service.web.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanUtil.applicationContext = applicationContext;
	}

	public static <T> T getBean(Class<T> clazz) {
		return (T) applicationContext.getBean(clazz);
	}
}
