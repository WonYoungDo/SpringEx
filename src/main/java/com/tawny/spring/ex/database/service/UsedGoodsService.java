package com.tawny.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawny.spring.ex.database.domain.UsedGoods;
import com.tawny.spring.ex.database.repository.UsedGoodsRepository;

// 로직을 담당한다 (business)
@Service
public class UsedGoodsService {
	
	@Autowired // 객체를 자동으로 생성해줌
	// 부하를 줄이기 위해 객체 생성 관리를 spring이 대신 해줌
	private UsedGoodsRepository usedGoodsRepository;
	
	// used_goods 리스트 조회 기능
	public List<UsedGoods >getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		
		return usedGoodsList;
	}
	
}
