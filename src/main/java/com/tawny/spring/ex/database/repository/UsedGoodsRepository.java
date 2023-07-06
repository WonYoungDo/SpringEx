package com.tawny.spring.ex.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tawny.spring.ex.database.domain.UsedGoods;


// Mybatis Framework 
// 데이터 베이스 쿼리 수행
@Repository
public interface UsedGoodsRepository {
	
	// used_goods 테이블 데이터 조회 리턴
	// 인터페이스라 객체 생성 불가
	public List<UsedGoods> selectUsedGoodsList();
		
	
}
