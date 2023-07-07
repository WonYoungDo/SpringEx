package com.tawny.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tawny.spring.ex.mybatis.domain.Review;

@Repository
public interface ReviewRepository {
	
	// id가 3인 리뷰 데이터 조회
	public Review selectReview(@Param("id") int id);
	

}
