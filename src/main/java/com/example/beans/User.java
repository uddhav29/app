package com.example.beans;

import javax.validation.constraints.NotBlank;

import com.example.validation.Name;

public class User {
	@Name(value="a")
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
