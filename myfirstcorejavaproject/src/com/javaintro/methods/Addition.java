package com.javaintro.methods;

// WAP with no return type with parameters
public class Addition {
                    
	
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("SUM OF TWO NUMBERS IS:" +sum);
		
	} 
	void sub(int a,int b)
	{
		int difference=a-b;
		System.out.println("DIFFERENCE BETWEEN TWO NUMBERS IS:"+difference);
		
	}
	void multiply(int a,int b)
	{
		int product=a*b;
		System.out.println("PRODUCT OF TWO NUMBERS IS:"+product);
		
	}
	void division(int a,int b)
	{
		int division =a/b;
		System.out.println("DIVISION OF TWO NUMBERS IS:"+division);
		
	}
	void Modulus(int a,int b)
	{
		int remainder =a%b;
		System.out.println("REMAINDER OF TWO NUMBERS IS:"+remainder);
		
	}
	
	
	void add1(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(" sum of threee numbers is:"+ sum);
	}
	void sub1( int a,int b,int c)
	{
		 int difference= a-b-c;
		 System.out.println("difference between three numbers :"+ difference);
	}
	void multiply(int a,int b,int c) {
		int product= a*b*c;
        System.out.println("MUltiplication of three numbers is:"+product); 	
        
	}
    void divmodulus(int a,int b)
    {
    	 int quotient =a/b;
    	 int remainder=a%b;
    	 System.out.println("quotient is  :"+ quotient);
    	 System.out.println("remainder is  :"+ remainder);
    }
    	
    	
	void main() {
		add(10,20);
		sub(30,40);
		multiply(8,64);
		division(7,49);
		 Modulus(7,56);
		 add1(105,5,99);
		 sub1(105,44,56);
		 multiply(24,66,78);
		 divmodulus(18,146);
		    
	
	}
}
