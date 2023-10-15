package com.chatApp.dataObjects;

public class User {

	public User(String email, String password){
		this.email = email;
		this.password = password;
	}

	public String email;
	public String password;

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}
}
