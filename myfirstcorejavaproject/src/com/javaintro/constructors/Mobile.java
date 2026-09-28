package com.javaintro.constructors;

public class Mobile 
{
	
	String Mobilename="vivo y400 5g";
	float Mobilecost= 30000.00f;
	String Mobilecolour="White";
	
	Mobile()
	{
		System.out.println("no args  called from mobile");
	}
	public static void main(String[] args) {
		System.out.println("Main method started from Mobile");
	}
}
class Smartphone extends Mobile{
	
	 Smartphone()
	 {  
		 System.out.println("no args from main");
	 }
		 public static void main(String[] args)
		 {
			
		 System.out.println("Main method started from smartphone");
		 Smartphone s= new Smartphone();
		 s.Smartphoneinfo();
	 }
     void Smartphoneinfo() {		 
    	   System.out.println("MOBILE NAME IS:"+super.Mobilename);
    	   System.out.println("MOBILE cost IS:"+super.Mobilecost);
    	   System.out.println("MOBILE colour  IS:"+super.Mobilecolour);
     }
}