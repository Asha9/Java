package com.TechnoGrowth;

public class TestDiv1 {
	int i;
	int j;
	int add(int i,int j)
	{
		int k=i+j;
		return k;
	}
public static void main(String[] args) {
	TestDiv1 t=new TestDiv1();
	int k=t.add(4,5);
	System.out.println("Addition is:"+k);
}
}
