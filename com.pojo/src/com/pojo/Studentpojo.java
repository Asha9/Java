package com.pojo;

import java.io.Serializable;

public class Studentpojo implements Serializable {
	
	private int rollno;
	private String studname;
	private String studaddress;

	public Studentpojo(int rollno, String studname, String studaddress) {
		super();
		this.rollno = rollno;
		this.studname = studname;
		this.studaddress = studaddress;
	}
	public Studentpojo() {
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudaddress() {
		return studaddress;
	}
	public void setStudaddress(String studaddress) {
		this.studaddress = studaddress;
	}
	@Override
	public String toString() {
		return "Studentpojo [rollno=" + rollno + ", studname=" + studname + ", studaddress=" + studaddress + "]";
	}
	
	public static void main(String[] args) {
		Studentpojo s= new Studentpojo(1,"asif","pune");
				System.out.println(s);
	}
}
