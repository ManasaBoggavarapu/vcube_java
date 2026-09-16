package com.javaintro;

public class Employee3 {
	int empid;
	 String empname;
	 int empsalary;
	 
	 void hello() {
		  System.out.println("EMP ID="+ 501);
		  System.out.println("EMP NAME="+ "Manas");
		  System.out.println("EMP SALARY="+ 50000.00);
	 }	  
		  
	 void hello1() {
			  System.out.println("EMP ID="+ 502);
			  System.out.println("EMP NAME="+ "SRI");
			  System.out.println("EMP SALARY="+ 60000.00);	  
		  
	 }
	 
	 void hello2() {
		  System.out.println("EMP ID="+ 503);
		  System.out.println("EMP NAME="+ "sani");
		  System.out.println("EMP SALARY="+ 400000.00);
	 } 
	public static void main(String[] args) {
	 Employee3 e1=new Employee3();
	 Employee3 e2=new Employee3();
	 Employee3 e3=new Employee3();
	    e1.hello();
	    e2.hello1();
	     e3.hello2();
	}

}

