package com.tawny.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tawny.spring.ex.jsp.domain.User;

@Repository
public interface UserRepository {
	
	// 사용자 정보를 전달 받고 insert
	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce);
	
	
	public int insertUserByObject(User user);
	
	
	
	// 가장 최근 사용자 조회
	public User selectLastUser(); // 객체 하나만 리턴함으로 엔티티를 리턴
	
	
	
}
