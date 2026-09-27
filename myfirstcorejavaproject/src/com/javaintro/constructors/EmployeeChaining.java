package com.javaintro.constructors;

public class EmployeeChaining {

	
	int id;
	String name;
	String designation;
	double salary;
    long hiredate;
    
    
    EmployeeChaining()
    {
    	   this(519);
    	  System.out.println("NO ARGS  CONSTRUCTOR CALLED");
    }
    
    EmployeeChaining(int id)
    {
    	   this(id,"MANAS");
    	System.out.println("1 ARGS  CONSTRUCTOR CALLED");
    }

    EmployeeChaining(int id,String name)
    {   
    	    this(id,name,500000);
    	    System.out.println("2 ARGS  CONSTRUCTOR CALLED");
    }
    EmployeeChaining(int id,String name,double salary)
    {
    	   this(id,name,salary,"HR");
      	System.out.println("3  ARGS  CONSTRUCTOR CALLED");
    	
    }
    EmployeeChaining(int id,String name,double salary,String designation ){
    	     this(id,name,salary,designation,13-03-2027);
         System.out.println("4 ARGS  CONSTRUCTOR CALLED");
    }
    
    EmployeeChaining(int id,String name,double salary,String designation,long hiredate )
    {   this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.hiredate=hiredate;
      	System.out.println("5 ARGS  CONSTRUCTOR CALLED");
    }
   	
	public static void main(String[] args)
	{
		EmployeeChaining e=new EmployeeChaining();
		e.EmployeeChaininginfo();
	}
	void EmployeeChaininginfo()
	{
		System.out.println("EMPLOYEEE ID IS:"+id);
		System.out.println("EMPLOYEEE NAME IS:"+name);
		System.out.println("EMPLOYEEE DESIGNATION  IS:"+designation);
		System.out.println("EMPLOYEEE SALARY IS:"+salary);
		System.out.println("EMPLOYEEE HIREDATE :"+hiredate);
	}
	

}
