package com.TechnoGrowth;

public class Signature {
	static int i=1;
	void m1()
	{
	 int j=2;
		System.out.println("value of j:"+j);
	}
	static public  void main(String[] asha) {
		// TODO Auto-generated method stub
		System.out.println("Main Method with Exchange Order in Signature");
		Signature s=new Signature();
		System.out.println("value of i:"+ i);
		s.m1();
	}

}
