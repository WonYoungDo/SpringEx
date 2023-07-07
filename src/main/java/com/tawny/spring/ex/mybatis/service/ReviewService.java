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
}
