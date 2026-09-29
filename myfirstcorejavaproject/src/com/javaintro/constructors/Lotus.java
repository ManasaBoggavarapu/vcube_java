package com.javaintro.constructors;

class Flower1{
	
	String name;
	String type;
	String colour;
//	Flower1()
//	{
//		System.out.println("no args called from flower");	
//	}
	Flower1(String name,String type,String colour)
	{
		this.name=name;
		this.type=type;
		this.colour=colour;
		
		System.out.println(" parameterized from Flower1");
	}

}
public class Lotus extends Flower1 {
	
	Lotus()
	{    //super();
		super("lotus","water Flower","pink");
		System.out.println("no args from lotus");
	}

	public static void main(String[] args) {
		System.out.println("main method from lotus");
		Lotus l=new Lotus();
		l.Lotusinfo();
		
     }
	 void Lotusinfo()
	 {
		 System.out.println("flower name is:"+name);
		 System.out.println("flower type is:"+type);
		 System.out.println("flower colour is:"+colour);
	 }

}
