package com.hm.source;

public class Student {

	private Integer ID;

	private String username;
	
	private String password;
	
	
	public Integer getID() {
		return ID;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
	public void setID(Integer iD) {
		ID = iD;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", username=" + username + ", password=" + password + "]";
	}

}
