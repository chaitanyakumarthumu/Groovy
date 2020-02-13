package com.example.SpringBoot_Project.exception;

import java.util.Date;

public class UserException {
	private String message;
	private Date date;
	private String details;
	public UserException(String message, Date date, String details) {
		super();
		this.message = message;
		this.date = date;
		this.details = details;
	}
	public UserException() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "UserException [message=" + message + ", date=" + date
				+ ", details=" + details + "]";
	}
	

}
