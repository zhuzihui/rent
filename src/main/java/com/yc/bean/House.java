package com.yc.bean;

import java.io.Serializable;

public class House implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int h_id;
	private int u_id;
	private int ht_id;
	private String h_title;
	private String h_description;
	private double h_price;
	private String h_pubdate;
	private int h_fllorage;
	private String h_content;
	private int s_id;
	
	
	@Override
	public String toString() {
		return "House [h_id=" + h_id + ", u_id=" + u_id + ", ht_id=" + ht_id
				+ ", h_title=" + h_title + ", h_description=" + h_description
				+ ", h_price=" + h_price + ", h_pubdate=" + h_pubdate
				+ ", h_fllorage=" + h_fllorage + ", h_content=" + h_content
				+ ", s_id=" + s_id + "]";
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getHt_id() {
		return ht_id;
	}
	public void setHt_id(int ht_id) {
		this.ht_id = ht_id;
	}
	public String getH_title() {
		return h_title;
	}
	public void setH_title(String h_title) {
		this.h_title = h_title;
	}
	public String getH_description() {
		return h_description;
	}
	public void setH_description(String h_description) {
		this.h_description = h_description;
	}
	public double getH_price() {
		return h_price;
	}
	public void setH_price(double h_price) {
		this.h_price = h_price;
	}
	public String getH_pubdate() {
		return h_pubdate;
	}
	public void setH_pubdate(String h_pubdate) {
		this.h_pubdate = h_pubdate;
	}
	public int getH_fllorage() {
		return h_fllorage;
	}
	public void setH_fllorage(int h_fllorage) {
		this.h_fllorage = h_fllorage;
	}
	public String getH_content() {
		return h_content;
	}
	public void setH_content(String h_content) {
		this.h_content = h_content;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
