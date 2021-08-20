package com.sejong.vue.model;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {
	private String id;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
	
	

}
