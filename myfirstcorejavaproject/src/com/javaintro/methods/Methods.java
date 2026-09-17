package com.javaintro.methods;

public class Methods {
    void  addition(int a,int b)
    {
        int sum=a+b;
         System.out.println("addition value "+sum);
         subtraction(sum,30);
    }
    void subtraction(int a,int b)
    {
  	   int subtraction=a-b;
  	   System.out.println("Subtraction value  "+subtraction);
  	     multiplication(subtraction,35 );
    }
    void multiplication(int a,int b)
    {
  	     int multiplication=a*b;
  	     System.out.println("Multiplication value "+multiplication);
  	     division(multiplication,12);
    }
    void division(int a,int b)
    { 
  	     int division=a/b;
  	     System.out.println("Division value "+ division);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Methods m1=new Methods();
		    m1.addition(10,20);
		
	}

}

