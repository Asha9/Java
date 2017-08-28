package com.TechnoGrowth;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al= new ArrayList<>();
		for(int i=1;i<15;i++)
		{
			al.add(i);
			
		}
		System.out.println(al.size());
		Vector v=new Vector<>(al);
		System.out.println(v.capacity());
		ArrayList al1= new ArrayList<>();
		//System.out.println(al1.size());
	}
		
		
	
		// TODO Auto-generated method stub

	}


