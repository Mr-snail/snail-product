package com.snail.product.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;




import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.snail.product.core.SysProductFacade;

@Controller
@RequestMapping("/product")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

   
    @Reference
    private SysProductFacade sysProductFacade;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ResponseBody
    public Object sayHellow() {
        return sysProductFacade.sayHello("程序员");
    }
    
    @RequestMapping(value = "/getProductList", method = RequestMethod.GET)
    @ResponseBody
    public Object getProductList() {
        return sysProductFacade.getProducts();
    }
    
    
   
    
}
