package com.snail.product.core;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public interface SysProductFacade {
	
	String sayHello(String name);

	public List<Object> getProducts();

	
	
}
