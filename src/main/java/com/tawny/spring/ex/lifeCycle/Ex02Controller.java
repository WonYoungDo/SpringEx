package com.tawny.spring.ex.lifeCycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("lifecycle/ex02")
	public String jspPage() {
		return "lifecycle/ex02";
	}
}
