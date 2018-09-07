package com.yc.bean;

import java.io.Serializable;

public class District implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int d_id;
	private String d_name;
	
	@Override
	public String toString() {
		return "District [d_id=" + d_id + ", d_name=" + d_name + "]";
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
