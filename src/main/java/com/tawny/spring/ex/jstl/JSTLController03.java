package com.tawny.spring.ex.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSTLController03 {
	@GetMapping("jstl/ex03")
	public String ex() {
		return "jstl/ex03";
	}
	
}
