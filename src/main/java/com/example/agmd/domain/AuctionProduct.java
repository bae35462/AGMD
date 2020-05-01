package com.example.agmd.domain;

import java.io.Serializable;
import java.util.Date;

public class AuctionProduct implements Serializable {
	private String apId;
	private String apPrice;
	private String apName;
	private String apAttr;
	private Date apStart;
	private Date apEnd;
	private String apMaxPrice;
	private String userId;
	
	public String getApId() {
		return apId;
	}
	public void setApId(String apId) {
		this.apId = apId;
	}
	public String getApPrice() {
		return apPrice;
	}
	public void setApPrice(String apPrice) {
		this.apPrice = apPrice;
	}
	public String getApName() {
		return apName;
	}
	public void setApName(String apName) {
		this.apName = apName;
	}
	public String getApAttr() {
		return apAttr;
	}
	public void setApAttr(String apAttr) {
		this.apAttr = apAttr;
	}
	public Date getApStart() {
		return apStart;
	}
	public void setApStart(Date apStart) {
		this.apStart = apStart;
	}
	public Date getApEnd() {
		return apEnd;
	}
	public void setApEnd(Date apEnd) {
		this.apEnd = apEnd;
	}
	public String getApMaxPrice() {
		return apMaxPrice;
	}
	public void setApMaxPrice(String apMaxPrice) {
		this.apMaxPrice = apMaxPrice;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
