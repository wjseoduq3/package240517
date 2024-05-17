package com.jdy.member;

import java.security.PublicKey;

public class Member { 
	
	// value object(VO) OR data transfer object(DTO)
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	
	public Member() {
		super();
	}
	
	public Member(String id, String pw, String name, String email, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public void setID(String id) {
//		this.id = id;
//	}
//	
//	public String getID() {
//		return this.id;		
//	}

	


	
	

}
