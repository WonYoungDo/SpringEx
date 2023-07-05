package com.tawny.spring.ex.lifeCycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lifecycle/ex01")// 공통 요소를 입력
public class Ex01restController {
	
	@RequestMapping("/3")
	// 객체 리턴
	public Person objectResponse() {
		Person person = new Person("원영도", 25);
		return person;
	}
	
	
	// status 코드를 포함한 response 
	// 200 OK 정상 처리 됨
	// 404 400 500 에러 
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse() {
		Person person = new Person("원영도", 25);
		
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
}
