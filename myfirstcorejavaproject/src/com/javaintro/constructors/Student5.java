package com.javaintro.constructors;

public class Student5 {
	
	int rollno;
	String branch;
	String name;
	int marks;
	Student5(int rollno,String branch,String name,int marks)
	{
	    this.rollno=rollno;
	    this.branch=branch;
	    this.name=name;
	    this.marks=marks;
	}
	Student5(String branch,int marks,Student5 s)
	{

	    this.rollno=s.rollno;
	    this.branch=branch;
	    this.name=s.name;
	    this.marks=marks;
	}
	void display()
	{
		System.out.println("Student roll no is:"+rollno);
		System.out.println("Student branch is:"+branch);
		System.out.println("Student name is:"+name);
		System.out.println("Student marks is:"+marks);
	}

	public static void main(String[] args) {
		Student5 s=new Student5(101,"cse","Manas",55);
		s.display();
		System.out.println("**************************");
		
		Student5 s1=new Student5("ECE",78,s);
         s1.display();
	}

}
