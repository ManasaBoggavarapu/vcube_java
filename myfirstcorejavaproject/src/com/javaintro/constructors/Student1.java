package com.javaintro.constructors;
//No args constructor
public class Student1 {
     int sid;
     String name;
     
   Student1()
   {    
	 System.out.println("NO args constructor called");  
	 sid=505;
	 name="Manasa";
	 
	   
   }
	public static void main(String[] args) {
//	  Student1 s1=new Student1();
//	  s1.sid=101;
//	  s1.name="Mahitha";
//	  s1.Studentinfo();
	  
	  Student1 s2=new Student1();
	  s2.Studentinfo();
	  
	  Student1 s3=new Student1();
	  s3.Studentinfo();
	  
	  Student1 s4=new Student1();
	  s4.Studentinfo();
	  
	  
	}
	void Studentinfo()
	{
		System.out.println("Student id is:"+sid);
		System.out.println("Student Name is:"+name);
	}
}