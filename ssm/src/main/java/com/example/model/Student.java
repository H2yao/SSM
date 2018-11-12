package com.example.model;

public class Student {
	
	private int id;
	private String sname;
	private int sage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Student(int id, String sname, int sage) {
		super();
		this.id = id;
		this.sname = sname;
		this.sage = sage;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
}
