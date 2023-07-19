package com.tawny.spring.ex.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tawny.spring.ex.jsp.domain.User;

@Repository
public interface NewUserRepository {
	
	public List<User> selectUserList();
	
	public int insertUser(
			@Param("naem") String name
			, @Param("birthday") String birthday
			, @Param("emaul") String email
			, @Param("introduce") String introduce);
}
