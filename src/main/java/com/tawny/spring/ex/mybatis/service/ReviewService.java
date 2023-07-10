package com.tawny.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawny.spring.ex.mybatis.domain.Review;
import com.tawny.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	// id가 3인 리뷰 테이터
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
		return review;
	}
	
	
	
		
	// storeId, menu, userName, point, review, 전달 받고 저장하는 기능
	public int addReview(
			int storeId
			, String menu
			, String userName
			, double point
			, String review) {
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		return count;
	}
	
	
	// 객체로 전달된 테이터 저장
	public int addReviewObject(Review review) {
		int count = reviewRepository.insertReviewObject(review);
		return count;
	}
	
}
