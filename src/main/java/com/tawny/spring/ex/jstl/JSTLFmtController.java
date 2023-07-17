package com.tawny.spring.ex.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JSTLFmtController {
	
	@GetMapping("/ex03")
	public String jstlEx01() {
		return "jstl/ex03";
	}
}
