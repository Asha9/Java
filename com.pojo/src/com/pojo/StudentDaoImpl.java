package com.pojo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentDaoImpl extends StudentPojo implements StudentDao  {
	
	public void setStudent(){
		
		FileOutputStream fos = null;
		//DataOutputStream Dos = null;
		ObjectOutputStream oos =null;
		Scanner sc= new Scanner(System.in);
		StudentPojo s = new StudentPojo();
		
		try {
			fos =new FileOutputStream("StudentData.txt",true);
			//Dos =new DataOutputStream(fos);
			oos= new ObjectOutputStream(fos);
			System.out.println("Enter the Rollno of Student:-");
			s.setRollno(sc.nextInt());
			System.out.println("Enter the name of Student:-");
			s.setStudname(sc.next());
			System.out.println("Enter the Address of Student:-");
			s.setStudaddress(sc.next());
			oos.writeObject(s);
			
	
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found.....");
		}
		
	}
	public void getStudent() {
		StudentPojo p1=null;
		
		FileInputStream filein=null;
		ObjectInputStream oos=null;
		try {
			filein=new FileInputStream("StudentData.txt");
			oos= new  ObjectInputStream(filein);
			p1=(StudentPojo)oos.readObject();
			System.out.println(p1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
}

