package com.javaintro.constructors;
//parent class
public  class Vehicle{
    String brand;
    String model;
    double price; 
     Vehicle()
     {
    	  System.out.println("no args constructor called from vehicle");
     }
	public static void main(String[] args) {
		System.out.println("main method started from vechicle");

	}
	

}
//child class
 class Bike extends Vehicle
 
{    
	Bike(){
		System.out.println("no args constructor called from bike"); 
	}
	Bike(String model,String brand,double price)
	{
		 super.model=model;
		 super.brand=brand;
		 super.price=price;
	}
	public static void main(String[] args)
	{
       System.out.println("main method started from Bike");

         Bike b=new Bike();
	     b.Bikeinfo();
	     
	     
	//     Bike b1=new Bike("FZ","YAMAHA",150000);
	//     b1.Bikeinfo();
	}
	void Bikeinfo()
	{
		System.out.println("BIKE BRAND IS:"+brand);
		System.out.println("BIKE MODEL IS:"+model);
		System.out.println("Bike Price is:"+price);
    }
}