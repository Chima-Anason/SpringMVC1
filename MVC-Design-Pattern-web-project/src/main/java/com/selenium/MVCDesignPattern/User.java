package com.selenium.MVCDesignPattern;

public class User {
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	private String phone_number;
	private String username;
	
	
	public User(int id, String email, String first_name, String last_name, String phone_number, String username) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.username = username;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	
}
