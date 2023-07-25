package com.tawny.spring.ex.jpa;

import org.springframework.stereotype.Controller;

import com.tawny.spring.ex.jpa.domain.Student;

@Controller	
public class StudentController {
	
	public void test() {
		// builder
		Student student = new Student();
		student.getName();
		
	}
}
