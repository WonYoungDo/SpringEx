package com.tawny.spring.ex.jpa.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자를 쓰게 해줌
@AllArgsConstructor // 생성자 자동 생성 (기본 생성자는 사라짐)
@Entity
@Table(name="new_student") // 쿼리 테이블 명
@Getter // 맴버 변수 사용
@Builder(toBuilder=true)
public class Student {

	// id, 이름, 전화번호, 이메일, 장래희망
	
	@Id // 프라이머리 키에 들어가는 어노테이션
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	// 카멜 케이스 맴버 변수 일 경우 매칭시켜줌
	@Column(name="phoneNumber") 
	private String phoneNumber;
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	
	@UpdateTimestamp // 자동으로 현재 시간을 업데이트 해주는 어노테이션
	@Column(name="createdAT", updatable=false) // update될때는 현재 시간이 수정되지 않는다.
	private ZonedDateTime createdAT;
	
	@UpdateTimestamp // 자동으로 현재 시간을 업데이트 해주는 어노테이션
	@Column(name="updatedAT")
	private ZonedDateTime updatedAT;
}
