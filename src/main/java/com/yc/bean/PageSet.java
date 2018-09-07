package com.yc.bean;

import java.io.Serializable;
import java.util.List;

public class PageSet implements Serializable{
	
	



	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String msg;
	private int total;		//总条数
	private int pagetotal;	//页面总数
	private int pagesize;	//页面大小
	private int page;		//当前页面
	private List<House> list;	//存个对象
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPagetotal() {
		return pagetotal;
	}
	public void setPagetotal(int pagetotal) {
		this.pagetotal = pagetotal;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<House> getList() {
		return list;
	}
	public void setList(List<House> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageSet [code=" + code + ", msg=" + msg + ", total=" + total
				+ ", pagetotal=" + pagetotal + ", pagesize=" + pagesize
				+ ", page=" + page + ", list=" + list + "]";
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public PageSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
