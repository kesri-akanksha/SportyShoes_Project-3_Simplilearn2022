package com.sportyshoes1.model;

import java.io.Serializable;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private String userName;
	
	private String password;
	
	public Admin() {
		super();
	}
	
	
	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", password=" + password + "]";
	}


	
	
	
	
	

}
