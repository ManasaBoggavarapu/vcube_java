package com.javaintro.constructors;

public class StudentChaining {
	
	int id;
	String name;
	String fname;
	String address;
	String mail;
	Long  mobileno;
	
    StudentChaining()
   {    this(101);
	   System.out.println("NO- args constructor called");
   }
    StudentChaining(int id)
    {      
    	    this(id,"MANASA");
 	   System.out.println("ONE- arg constructor called");
    }
    StudentChaining(int id,String name)
    {
    	   this(id,name,"subbarao"); 
 	   System.out.println("Two- args constructor called");
    }
    StudentChaining(int id,String name,String fname)
    {
    	   this(id,name,fname,"PATHA REPUDI");
 	   System.out.println("THREE- args constructor called");
    }
 	
    StudentChaining(int id,String name,String fname,String address)
    {
    	 this(id,name,fname,address,"manasaboggavarapu52@gmail.com");
 	   System.out.println("FOUR- args constructor called");
    }
    StudentChaining(int id,String name,String fname,String address,String mail)
    {
       this(id,name,fname,address,mail,9848790800L);
 	   System.out.println("Five- args constructor called");
    }
    StudentChaining(int id,String name,String fname,String address,String mail,long mobileno)
    {
    	
    	     this.id=id;
    	     this.name=name;
    	     this.fname=fname;
    	     this.address=address;
    	     this.mail=mail;
    	     this.mobileno=mobileno;
 	   System.out.println("SIX- args constructor called");
    }
 	
 	
	   
	public static void main(String[] args) {
		StudentChaining  s= new StudentChaining();
         s.StudentChaininginfo();
	}
	void StudentChaininginfo()
	{
		System.out.println("STUDENT ID IS:"+id);
		System.out.println("STUDENT NAME IS:"+name);
		System.out.println("STUDENT FNAME IS:"+fname);
	    System.out.println("STUDENT ADDRESS IS:"+address);
	    System.out.println("STUDENT MAIL IS:"+mail);
	    System.out.println("STUDENT MOBILE NUMBER IS:"+mobileno);

    }
}