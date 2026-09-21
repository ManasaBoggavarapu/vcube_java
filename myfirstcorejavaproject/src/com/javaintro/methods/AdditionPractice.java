package com.javaintro.methods;
// WAP with no return type and no parameters
public class AdditionPractice {
 //Add 5 numbers
//	Add 10 numbers
//	Add two decimal numbers
//Add three decimal numbers
//Add positive numbers
//Add negative numbers
//Add positive and negative numbers
//Add two numbers and print result
//Add two numbers and subtract another number
//Add two numbers and multiply the result by another number
	
	
	void add()
	{
	   int a=10;
	   int b=20;
	   int c=30;
	   int d=40;
	   int e=50;
	   int add=a+b+c+d+e;
		System.out.println("addtion of 5 numbers is :"+ add);
		
	}
//	Add 10 numbers

	void add1 ()
	{
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	int e=60;
	int f=06;
	int g=30;
	int h=45;
	int i=33;
	int add=a+b+c+d+e+f+g+h+i;
	System.out.println("addition of 10 numbers is:"+add);
	}
//	Add two decimal numbers	
	
	void decimal()
	{
		double a=45.8;
		double b=43.6;
		double add=a+b;
		System.out.println("ADDITION OF DECIMAL NUMBERS:"+add);
	}
	//Add three decimal 
     void decimal1()
     { 
    	 double a=34.5;
    	 double b=78.5;
    	 double c=34.5;
    	 double add= a+b+c;
    	 System.out.println("addition of three decimals :"+ add);
    	 
     }
   //Add positive numbers
     
     void positive()
     {
    	   int a=1;
    	   int b=3;
    	   int sum =a+b;
    	   System.out.println("addition of positive numbers:"+sum);
     }
   //Add negative numbers
     void negative()
     {
    	  int a=-1;
    	  int b=-44;
    	  int sum=a+b;
    	  System.out.println("additon of negative numbers:"+sum);
     }
    //add positive and negative numbers
     
     void posNegative()
     {
     int a=3;
     int b=4;
     int c=-3;
     int d=-56;
     int sum =a+b+c+d;
     System.out.println("addition of positive and negative numbers:"+ sum);
}
//add two numbers and print the result
     void add2()
     {
    	 int a=50;
    	 int b=45;
    	 int result=a+b;
    	 System.out.println("result of 2 numbers is:"+result);
     }
   //Add two numbers and subtract another number
     
     void add3()
     {
    	    int a=56;
    	    int b= 45;
    	    int c=5;
    	    int result= a+b-c;
    	    System.out.println("  result is:"+ result);
     }  
 //Add two numbers and multiply the result by another number
     void   add4()
     {
    	    int a= 43;
    	    int b=34;
    	    int c= 345;
    	    int result = a+b*c;
    	    System.out.println(" result is:" + result );
     }
     
	void main() 
	{
		 add();
		 add1();
		 decimal();
		 decimal1();
		 positive();
		 negative();
		 posNegative();
		 add2();
		 add3();
		 add4();
	} 
}
