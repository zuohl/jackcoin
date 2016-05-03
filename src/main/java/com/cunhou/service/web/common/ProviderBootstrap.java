package com.cunhou.service.web.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * provider主程序入口
 * @author chenmaomao
 *
 */
public class ProviderBootstrap {

	static ClassPathXmlApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] { "classpath:spring-application.xml", "classpath:dubbo/provider/*.xml" });
		context.start();
	
		while(true){
			//进程不中断
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
		
	}

}
