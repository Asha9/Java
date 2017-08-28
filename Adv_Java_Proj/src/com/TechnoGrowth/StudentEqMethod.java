package com.TechnoGrowth;

public class StudentEqMethod {
	int id;
	String name;
	StudentEqMethod(int id,String name)
			{
		this.id=id;
		this.name=name;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEqMethod s=new 	StudentEqMethod(101, "xyz");
		StudentEqMethod s1=new 	StudentEqMethod(102, "pqr");
		System.out.println(s1==s);
		System.out.println(s.equals(s1));

	}

}
