package com.fujitsu.loginAndRegister.model;

public class User {
	int id;
	String name;
	String password;
	int phone;
	String address;
	
	
	
	public User(int id, String name, String password, int phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	  @Override
	  public String toString() {
		  return "User [id=" + id + ", name=" +
	  name + ", password=" + password + ", phone=" + phone + ", address=" + address
	  + "]"; 
		  }
	 
	

}
