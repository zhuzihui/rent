package com.yc.bean;

import java.io.Serializable;

public class Page implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int start;
	private int pagesize;
	
	
	@Override
	public String toString() {
		return "Page [start=" + start + ", pagesize=" + pagesize + "]";
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	
	public Page(int start, int pagesize) {
		super();
		this.start = start;
		this.pagesize = pagesize;
	}
	public Page() {
		super();
	}
	
	
}
