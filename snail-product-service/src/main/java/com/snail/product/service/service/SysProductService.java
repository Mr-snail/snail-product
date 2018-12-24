package com.snail.product.service.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;








import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.snail.product.core.SysProductFacade;
import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;


@Service("sysProductService")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=com.snail.product.core.SysProductFacade.class, protocol = {"dubbo"})
public class SysProductService implements SysProductFacade {

	@Override
	public String sayHello(String name) {
		String respose = "你好"+name;
		return respose;
	}

	@Override
	public List<Object> getProducts() {
		 
		 List<Object> product = new ArrayList<Object>();
		 for(int i=0;i<10;i++){
			 product.add("商品"+i);
		 }
		 
		return product;
	}

	 
	 

}
