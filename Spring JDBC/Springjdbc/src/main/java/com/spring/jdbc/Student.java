package com.spring.jdbc;

public class Student {
	 private int id;
	 
	 private  String S_name;
	 
	 private  String Branch;

	public Student(int id, String s_name, String Branch) {
		super();
		this.id = id;
		S_name = s_name;
		this.Branch = Branch;
	}

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getS_name() {
		return S_name;
	}



	public void setS_name(String s_name) {
		S_name = s_name;
	}



	public String getBranch() {
		return Branch;
	}



	public void setBranch(String branch) {
		this.Branch = branch;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", S_name=" + S_name + ", branch=" + Branch + "]";
	}
	
	
	
	

}
