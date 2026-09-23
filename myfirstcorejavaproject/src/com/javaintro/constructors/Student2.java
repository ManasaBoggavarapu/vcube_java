package com.javaintro.constructors;

public class Student2{
	int sid;
	String name;
	
	Student2(){
		sid=101;
		name="unknown";

	
	}
	
	
//Parameterized constructor
	Student2(int sid,String name){
		
		this.sid=sid;
		this.name=name;
	   	
		
	}
	public static void main(String[] args) {
		Student2 s1=new Student2(18,"Manasa");
		s1.Studentinfo();
	}
	void Studentinfo()
	{
		System.out.println("Student id is:"+sid);
		System.out.println("Student Name is:"+name);
	}

}
