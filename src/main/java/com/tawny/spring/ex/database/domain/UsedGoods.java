package com.tawny.spring.ex.database.domain;

import java.util.Date;

// used_goods 테이블의 컬럼 이름과 일치하는 뱀버변수를 가진 클래스
// entity, domain
public class UsedGoods {
	
	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String dascription;
	private String image;
	private Date createdAT;
	private Date updateAT;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDascription() {
		return dascription;
	}
	public void setDascription(String dascription) {
		this.dascription = dascription;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}
	public Date getUpdateAT() {
		return updateAT;
	}
	public void setUpdateAT(Date updateAT) {
		this.updateAT = updateAT;
	}
	
}
