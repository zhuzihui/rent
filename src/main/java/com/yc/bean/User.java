package com.yc.bean;

import java.io.Serializable;

public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int u_id;
	private String u_name;
	private String u_password;
	private String u_telephone;
	private String u_username;
	private String u_isadmin;
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_password="
				+ u_password + ", u_telephone=" + u_telephone + ", u_username="
				+ u_username + ", u_isadmin=" + u_isadmin + "]";
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_telephone() {
		return u_telephone;
	}
	public void setU_telephone(String u_telephone) {
		this.u_telephone = u_telephone;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_isadmin() {
		return u_isadmin;
	}
	public void setU_isadmin(String u_isadmin) {
		this.u_isadmin = u_isadmin;
	}
	
	public User() {
		super();
	}
	
	

}
