package com.users;

public class user {
	
	private int user_id;
	private String name;
	private String phone_no;
	private String email;
	private String password;
	private String role;
	private String hospital;
	
	
	public user(int user_id, String name, String phone_no, String email, String password , String role,String hospital) {
		
		this.user_id = user_id;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.password = password;
		this.role = role;
		this.hospital = hospital;
		
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
	public String getRole() {
		return role;
		
	}
	public String gethospital() {
		return hospital;
	}





}
