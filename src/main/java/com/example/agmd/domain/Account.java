package com.example.agmd.domain;

import java.io.Serializable;

public class Account implements Serializable {
	
	private String userId;
	private String userName;
	private String userPass;
	private String phone;
	private String userCity;
	private String userGu;
	private String userDong;
	private String userAdd;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserGu() {
		return userGu;
	}
	public void setUserGu(String userGu) {
		this.userGu = userGu;
	}
	public String getUserDong() {
		return userDong;
	}
	public void setUserDong(String userDong) {
		this.userDong = userDong;
	}
	public String getUserAdd() {
		return userAdd;
	}
	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	
	

}
