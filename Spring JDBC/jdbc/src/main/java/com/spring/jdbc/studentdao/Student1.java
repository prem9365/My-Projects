package com.spring.jdbc.studentdao;

public class Student1 {


	 private double id;
	 
	 private  String S_name;
	 
	 private  String Branch;

	public Student1(double id, String s_name, String branch) {
		super();
		this.id = id;
		S_name = s_name;
		this.Branch = branch;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getId() {
		return id;
	}



	public void setId(double id) {
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
