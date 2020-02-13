package com.example.SpringBoot_Project.user;

import java.util.Date;

import javax.validation.constraints.Size;

public class UserBean {
	private Integer userId;
	@Size(min=2,message="please enter userName size above 2 characters.")
	private String userName;
	private Date userDateOfBirth;
	
	public UserBean() {
		super();
	}

	public UserBean(Integer userId, String userName, Date userDateOfBirth) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDateOfBirth = userDateOfBirth;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}

	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName
				+ ", userDateOfBirth=" + userDateOfBirth + "]";
	}
	
	

}
