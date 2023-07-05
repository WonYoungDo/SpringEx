package com.tawny.spring.ex.lifeCycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Ex01Controller {
	
	
	
	
	@RequestMapping("/lifecycle/ex01/2")
	@ResponseBody
	public Map<String, Integer>	mapResponse() {
	// 과일 이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1200);
		fruitMap.put("apple", 3000);
		fruitMap.put("apple", 1000);
		return fruitMap; 
		
	}
}
