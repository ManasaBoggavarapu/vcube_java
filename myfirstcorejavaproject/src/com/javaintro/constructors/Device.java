package com.javaintro.constructors;

public class Device {
	String name ="LAPTOP";
	float rating=4.7f;
	float cost= 70000.00f;
    Device()
    {
    	  System.out.println("no args called from device");
    }
	public static void main(String[] args) {
		System.out.println("main method started from device");

	}

}
class  Laptop extends Device{
	
	Laptop()
	{
		System.out.println("no args called from laptop");
	}
	public static void main(String[] args) {
		System.out.println("Main method started from Laptop");
		Laptop l=new Laptop();
		l.Laptopinfo();	
	}
	void Laptopinfo()
	{
		System.out.println("Device name is:"+super.name);
		System.out.println("Device cost is:"+super.cost);
		System.out.println("Device rating is:"+super.rating);
		
	}
}
