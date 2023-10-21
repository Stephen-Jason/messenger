package com.chatApp.dataObjects;

import net.lemnik.eodsql.ResultColumn;

public class User {

	@ResultColumn("email")
	public String email;
	@ResultColumn("password")
	public String password;

	public User(String email, String password){
		this.email = email;
		this.password = password;
	}

	@ResultColumn("email")
	public String getEmail() {
		return this.email;
	}

	@ResultColumn("password")
	public String getPassword() {
		return this.password;
	}

	@ResultColumn("email")
	public void setEmail(String email){
		this.email = email;
	}

	@ResultColumn("password")
	public void setPassword(String password){
		this.password = password;
	}


}
