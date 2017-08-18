package com.pojo;

import java.io.Serializable;

public class Teacherpojo implements Serializable {
	private int teacherid;
	private String teachername;
	private String teacheraddress;
	public Teacherpojo(int teacherid, String teachername, String teacheraddress) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
		this.teacheraddress = teacheraddress;
	}
	
	public Teacherpojo() {
		super();
	}

	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacheraddress() {
		return teacheraddress;
	}
	public void setTeacheraddress(String teacheraddress) {
		this.teacheraddress = teacheraddress;
	}
	@Override
	public String toString() {
		return "Teacherpojo [teacherid=" + teacherid + ", teachername=" + teachername + ", teacheraddress="
				+ teacheraddress + "]";
	}
public static void main(String[] args) {
	Teacherpojo t = new Teacherpojo(1,"pramod","pune");
	System.out.println(t);
}
}
