package com.TechnoGrowth;

public class DataType {
	int i=10;
	static int j=20;

void m1()
{
	System.out.println("Value of i with m1:"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataType d=new DataType();
		System.out.println("Value of i:"+ d.i);
		System.out.println("Value of j:"+j);
		d.m1();

	}

}
