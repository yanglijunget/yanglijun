package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping("zhshowInfo")
	@ResponseBody
	public Map<String, Object> zhshowInfo() {
		System.out.println("DemoController.zhshowInfo()");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nama", "张晖");
		return map;
	}
	
}
