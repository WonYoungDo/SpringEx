package com.tawny.spring.ex.jsp.domain;

import java.util.Date;

public class User {
	
	private int id;
	private String name;
	private String yyyymmdd;
	private String email;
	private String introduce;
	private Date createdAT;
	private Date updatedAT;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYyyymmdd() {
		return yyyymmdd;
	}
	public void setYyyymmdd(String yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Date getCreatedAT() {
		return createdAT;
	}
	public void setCreatedAT(Date createdAT) {
		this.createdAT = createdAT;
	}
	public Date getUpdatedAT() {
		return updatedAT;
	}
	public void setUpdatedAT(Date updatedAT) {
		this.updatedAT = updatedAT;
	}
	
	
}
