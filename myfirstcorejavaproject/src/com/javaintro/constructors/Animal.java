package com.javaintro.constructors;

 public  class Animal {
     String breedname;
     String dogname;
      float height;
      String colour;
      float weight;
      Animal()
      {
    	  System.out.println("No args called from Animal");
      }
	public static void main(String[] args) {
	   System.out.println("Main method started from Animal");

	}

}
class Dog extends Animal{      
    Dog(String breedname,String dogname,float height,String colour,float weight)
    {
    	super();
    	super.breedname=breedname;
    	super.dogname= dogname;
    	super.height= height;
    	super.colour=colour;
    	super.weight=weight;
    }
    Dog()
    {
    	   System.out.println("no args called from dog ");
    }
      public static void main(String[]args)
      {
	    System.out.println("Main method started");
         Dog d= new Dog();
	      d.doginfo();
	     System.out.println("********************************"); 
	      Dog d1=new Dog("boxer","LEO",2.3f,"WHITE",15.67f);
	      d1.doginfo();
       }
      void doginfo()
      {
    	    System.out.println("Dog breed name is:"+breedname);
    	    System.out.println("Dog Name is:"+dogname);
    	    System.out.println("Dog colour is:"+colour);
    	    System.out.println("Dog height is:"+height);
    	    System.out.println("Dog weight is:"+weight);
      }

}