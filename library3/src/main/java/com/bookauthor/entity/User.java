package com.bookauthor.entity;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	@Id
    private Integer uid;
    private String name;
    private String username;
    private String password;
	public Integer getId() {
		return uid;
	}
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(Integer uid, String name, String username, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	
	
    
    
    
}
