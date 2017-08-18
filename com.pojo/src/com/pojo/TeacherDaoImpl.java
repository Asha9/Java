package com.pojo;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TeacherDaoImpl extends Studentpojo implements TeacherDao  {
	
	public void setTeacher(){
		
		FileOutputStream fos = null;
		//DataOutputStream Dos = null;
		ObjectOutputStream oos =null;
		Scanner sc= new Scanner(System.in);
		Teacherpojo t = new Teacherpojo();
		
		try {
			fos =new FileOutputStream("TeacherData.txt",true);
			//Dos =new DataOutputStream(fos);
			oos= new ObjectOutputStream(fos);
			System.out.println("Enter the ID of Teacher:-");
			t.setTeacherid(sc.nextInt());
			System.out.println("Enter the name of Teacher:-");
			t.setTeachername(sc.next());
			System.out.println("Enter the Address of Teacher:-");
			t.setTeacheraddress(sc.next());
			oos.writeObject(t);
			
	
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found.....");
		}
		
	}
	public void getTeacher() {
       Teacherpojo t1=null;
		
		FileInputStream filein=null;
		ObjectInputStream oos=null;
		try {
			filein=new FileInputStream("TeacherData.txt");
			oos= new  ObjectInputStream(filein);
			t1=(Teacherpojo)oos.readObject();
			System.out.println(t1);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

