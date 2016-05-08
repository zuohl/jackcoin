package com.cunhou.service.web.common.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author jtx
 *
 */
public class ConfigUtil {

	private static Properties p;
//	static{
//		InputStream resourceAsStream = ConfigUtil.class.getClass().getResourceAsStream("/config.properties");
//  
//         //生成properties对象  
//        p = new Properties();  
//        try {  
//            p.load(resourceAsStream);  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//	}
	
	public String getConfigValue(String key){
		
		InputStream resourceAsStream = this.getClass().getResourceAsStream("config.properties");
		  System.out.println();
        //生成properties对象  
       p = new Properties();  
       try {  
           p.load(resourceAsStream);  
       } catch (Exception e) {  
           e.printStackTrace();  
       }  
       
		if(p.get(key) != null){
			return (String)(p.getProperty(key));
		}else{
			return "";
		}
	}
	
	public static void main(String[] args) {
		InputStream resourceAsStream = ConfigUtil.class.getClass().getResourceAsStream("/config.properties");
		  System.out.println(ConfigUtil.class.getClass().getResource("/config.properties"));
		 System.out.println(System.getProperty("user.dir")  );
        // 生成properties对象  
        p = new Properties();  
        try {  
            p.load(resourceAsStream);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        System.out.println("path = " + p.getProperty("photoPath"));
	}
}
