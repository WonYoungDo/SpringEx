package com.tawny.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tawny.spring.ex.mybatis.domain.Review;
import com.tawny.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// id가 3인 review 데이터 조회
	@ResponseBody
	@RequestMapping("/mybatis/review")
	public Review review(@RequestParam("id") int id) {
		Review review = reviewService.getReview(id);
		
		return review;
	}
	
	
}
