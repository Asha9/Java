package com.employee.beans;

public class EmployeeProfile
{
int empid;
String empname;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public EmployeeProfile(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
public static void main(String[] args) {
	
}
}
