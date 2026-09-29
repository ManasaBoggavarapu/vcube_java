package com.javaintro.constructors;
  public class Animal1 {
	    String breed;
	    String name;
	     int age;

	Animal1()
	{		
		System.out.println("no args from Animal");	}
	Animal1(String breed,String name,int age)
	{   this.breed=breed;
	    this.name=name;
	    this.age=age;
		System.out.println("Parameterized called from Animal");
	}
	public static void main(String[] args) {
		System.out.println("main method from animal");
	}
	
	
		
	

}
 class Cat extends Animal1
{
	
	Cat()
	{    super("gloden retriver","leo",15);
		System.out.println("no args called from Cat");
	}
	public static void main(String[] args){
		System.out.println("main method called from Cat");
		Cat c=new Cat();
		c.Catinfo();
		
	}
	
	void Catinfo()
	{
		System.out.println("BREED OF THE ANIMAL IS:"+breed);
		System.out.println("NAME OF THE ANIMAL IS:"+name);
		System.out.println("AGE OF THE ANIMAL IS:"+age);
		
	}
}

	

