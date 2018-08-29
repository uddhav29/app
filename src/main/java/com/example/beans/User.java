package com.example.beans;

public class User {

	private String userName;
	private String message;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", message=" + message + "]";
	}
	
}
