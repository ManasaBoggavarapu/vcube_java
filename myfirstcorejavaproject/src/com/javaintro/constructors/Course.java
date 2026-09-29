package com.javaintro.constructors;

public class Course {
	   String name;
	   float cost;
	   int duration;
	   
    Course()
    {
    	  System.out.println("no args constructor called");
    }
	public static void main(String[] args) {
		System.out.println("main method started from course");

	}

}
class java extends Course
{
	java()
	{    super();
		System.out.println("no arg called  from java");
	}
	java(String name,float cost, int duration)
	{   super();
		super.name=name;
		super.cost=cost;
		super.duration=duration;
	}
	public static void main(String[] args) {
		System.out.println("main method started from java");
		java j=new java();
		j.javainfo();
		System.out.println("********************");
		java j1=new java("laptop",70000.00f,6);
		j1.javainfo();
	}
	void javainfo()
	{
		System.out.println("course name is:"+name);
		System.out.println("course cost is:"+cost);
		System.out.println("course duration is:"+duration);
		
	}
}