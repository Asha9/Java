package com.pojo;

public class Controller {

public static void main(String[] args) {
	
StudentDaoImpl d1=new StudentDaoImpl();
TeacherDaoImpl d2=new TeacherDaoImpl();
d1.setStudent();
d2.setTeacher();
d1.getStudent();
d2.getTeacher();	
}
}
