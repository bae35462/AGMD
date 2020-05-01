package com.example.agmd.domain;

import java.util.Date;

public class Order {
	private int orderId;
	private String userId;
	private Date orderDate;
	private String billName;
	private String billCity;
	private String billGu;
	private String billDong;
	private String billAdd;
	private String billZip;
	private String totalPrice;
	private String credicard;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillCity() {
		return billCity;
	}
	public void setBillCity(String billCity) {
		this.billCity = billCity;
	}
	public String getBillGu() {
		return billGu;
	}
	public void setBillGu(String billGu) {
		this.billGu = billGu;
	}
	public String getBillDong() {
		return billDong;
	}
	public void setBillDong(String billDong) {
		this.billDong = billDong;
	}
	public String getBillAdd() {
		return billAdd;
	}
	public void setBillAdd(String billAdd) {
		this.billAdd = billAdd;
	}
	public String getBillZip() {
		return billZip;
	}
	public void setBillZip(String billZip) {
		this.billZip = billZip;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCredicard() {
		return credicard;
	}
	public void setCredicard(String credicard) {
		this.credicard = credicard;
	}

	public void initOrder(Account account, Cart cart) {
		userId= account.getUserId();
		orderDate = new Date();
		
		billName = account.get
	}
}
