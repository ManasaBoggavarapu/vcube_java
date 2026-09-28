]package com.javaintro.constructors;

public class HeadphoneChaining {
	String brand;
	String Type;
	double price;
	
	HeadphoneChaining()
	{
		this(brand,"WIRELESS");
	}
	HeadphoneChaining(String brand)
	{
		this(brand,Type,5000.00);
	}
	HeadphoneChaining(String brand,String Type)
	{
		this("sony");
	}
	HeadphoneChaining(String brand,String Type,double price)
	{
		this.brand=brand;
		this.Type=Type;
		this.price=price; 
		
	}	
	
    public static void main(String[]args)
    {
    	  HeadphoneChaining h=new HeadphoneChaining();
    	  h.HeadphoneChaininginfo();
    }
    void HeadphoneChaininginfo()
    {
    	    System.out.println("HEAD PHONE BRAND IS:"+brand);
    	    System.out.println("HEAD PHONE TYPE IS:"+Type);
    	    System.out.println("HEADPHONE PRICE IS:"+price);
    }