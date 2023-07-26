package com.tawny.spring.ex.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tawny.spring.ex.jpa.domain.Student;
import com.tawny.spring.ex.jpa.service.StudentService;

@RequestMapping("/lombok")
@Controller	
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/student")
	@ResponseBody
	public Student createStudent() {
		
		String name = "원영도";
		String phoneNumber = "010-1111-2222";
		String email = "dnjswyd1@naver.com";
		String dreamJob = "개발자";
		
		Student student = studentService.addStudent(name, phoneNumber, email, dreamJob);
		return student;
	}
	
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		// id가 1인 데이터의 장래희망을 강사로 변경
	
		Student student = studentService.updateStudentDreamJob(1, "강사");
		return student;
	}
	
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		
		// id가 1인 데이터 삭제
		studentService.deleteStudent(1);
		
		return "삭제 성공";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
