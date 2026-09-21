package com.javaintro.methods;

public class Subtraction {
	//Subtract two numbers
	//Subtract three numbers
	//Subtract two numbers from a third number
	//Subtract salary from income
	//Find difference between two numbers
	//Find difference between two ages
	//Find difference between two marks
	//Find difference between two prices
	//Subtract 10 from a number
	//Subtract 20 and then subtract 30 from a number
	//Subtract two numbers
	void  subtraction()
	{
		int a=30;
	    int b= 40;
	    int difference=  a-b;
	    System.out.println("subtraction of two numbers:"+ difference);
	}
	void subtraction1()
	{
		int a=3;
		int b=23;
		int c= 34;
		int difference = a-b-c;
		System.out.println("subtraction of 3 numbers is:" + difference);
	}	
 //Subtract two numbers from a third number
	void subtract()
	{
		int a=34;
		int b=45;
		int c=56;
		int difference = (a-b)-c;
		System.out.println(" Subtract two numbers from a third number is:"+  difference);
	}
	//Subtract salary from income
	void subtract1()
	{
		int salary=98000;
		int income=5600;
		int difference=salary- income;
		System.out.println(" after subtraction salary from income the salary is:"+difference);		  
	}
	//Find difference between two numbers
	void difference()
	{
		int a=10;
		int b=23;
		int difference=a-b;
		System.out.println(" DIFFERENCE BETWEEN TWO NUMBERS IS:"+ difference);
	}
	//Find difference between two ages
	void difference1()
	{
		int age1=45;
		int age2=23;
		int difference=age1-age2;
		System.out.println(" DIFFERENCE BETWEEN TWO AGES IS :"+ difference);
	}
	//find difference between two marks
	void  difference2()
	{
		int marks1=98;
		int marks2=85;
		int  difference= marks1-marks2;
		System.out.println("DIFFERENCE BETWEEN TWO MARKS IS:"+ difference);
	}
	//Find difference between two prices
	void  difference3()
	{
		float bookprice=44.8f;
		float pencilprice=10.0f;
		float difference = bookprice - pencilprice;
		System.out.println(" DIFFERENCE BETWEEN TWO PRICES IS:"+ difference);
		
	}
		//Subtract 10 from a number
	    void sub()
	    {
	    	  int a=50;
	    	  int b=10;
	    	  int difference =a-b;
	    	  System.out.println("result of sub 10 from another number is:"+difference);
	    }
	
		//Subtract 20 and then subtract 30 from a number
	    void sub1()
	    {
	    	   int a=500;
	    	   int b=20;
	    	   int c=30;
	    	   int difference =(a-b)-c;
	    	   System.out.println("result of sub 20 and then sub 30 from a number:"+difference);
	    	   
	    }
	     
    void main() {
    	   subtraction();
       subtraction1();
    	   subtract();
	   subtract1();
	   difference();
	   difference1();
	   difference2();
	   difference3();
	   sub();
	   sub1();

	}

}
