package com.cunhou.service.web.common.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonUtil {
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	private JsonUtil() {

	}
	
	public static ObjectMapper getMapper() {
		return mapper;
	}

	/**
	 * Java Object to JSON
	 * 
	 * @param obj
	 * @return JSON string
	 */
	public static String toJson(Object obj) {
		try {
			return getMapper().writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> T  deserialize(String in, Class<T> classType){
		if (in == null || classType == null) {
			return null;
		}
		try {
			return mapper.reader(classType).readValue(in);
		} catch (JsonProcessingException e) {
			System.err.println("Json parse error with string:"+in);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static <T> List<T> stringToList(String datas, Class<T> beanClass) {

		try {
			return mapper.readValue(datas, mapper.getTypeFactory().constructParametricType(ArrayList.class, beanClass));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ArrayList<T>();
	}
}
