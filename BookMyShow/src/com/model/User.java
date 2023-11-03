package com.model;

public class User {
	
	private String userName;
	private String password;
	public User() {}
	
	public User(String username2, String password2) {
		 this.userName = username2;
		 this.password = password2;
		 }
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
