package com.mypackage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	String username;
	int password;
	int phone;
	int id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * // @Override // public String toString() // { // return "username: " +
	 * this.username + "password :" + this.password ; // }
	 */	
	}
	

