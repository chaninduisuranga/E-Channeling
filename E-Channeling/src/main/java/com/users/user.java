package com.users;

public class user {
	
	private int user_id;
	private String name;
	private String phone_no;
	private String email;
	private String password;
	
	
	public user(int user_id, String name, String phone_no, String email, String password) {
		
		this.user_id = user_id;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.password = password;
		
	}

	public int getUser_id() {
		return user_id;
	}

	public String getName() {
		return name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}



}
