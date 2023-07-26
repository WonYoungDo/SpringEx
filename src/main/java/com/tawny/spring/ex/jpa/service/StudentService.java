package com.tawny.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawny.spring.ex.jpa.domain.Student;
import com.tawny.spring.ex.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student addStudent(
			String name
			, String phoneNumber
			, String email
			, String dreamJob) {
		
		// 알아서 객체를 생성해줌
		Student student = Student.builder() 				
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJob)
				.build();
		
		student = studentRepository.save(student);
		return student;
	}
	
	
	public Student updateStudentDreamJob(int id, String dreamJob) {
		
		// 1. update 대상이 되는 행을 조회한다. 객체로 조회됨
		// 2. 조회된 객체에서 필요한 맴버변수를 수정한다.
		// 3. 해당 객체를 저장한다.
		
		// Optional<Student>	
		// null 일 수도 있는 객체를 리턴할 때 사용하는 클래스
		Optional<Student> optionalStudent = studentRepository.findById(id); // 없는 아이디가 존재할 수도 있음을 방지
		Student student = optionalStudent.orElse(null);
		
		if(student != null) {
			student = student.toBuilder()
			.dreamJob(dreamJob)
			.build();
			
			student =  studentRepository.save(student);
		}
		return student;
	}
	
	
	public void deleteStudent(int id) {
		
		// 삭제 대상의 객체를 얻어온다
		// 객체를 기반으로 삭제한다.
//		Student student = studentRepository.findById(id).orElse(null);
//	
//		if(student != null) {
//			studentRepository.delete(student);
//		}
	// 리턴 타입이 void이므로 리턴이 필요없음
		
		
		Optional<Student> optionalStudent = studentRepository.findById(id);
		
		// 람다식
		optionalStudent.ifPresent(student -> studentRepository.delete(student));
				
		
		
		
		
	}
	
	
	
	
}
