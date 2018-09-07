package com.yc.bean;

import java.io.Serializable;

public class Street implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int s_id;
	private String s_name;
	private int d_id;
	
	
	public Street() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Street [s_id=" + s_id + ", s_name=" + s_name + ", d_id=" + d_id
				+ "]";
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	
	

}
