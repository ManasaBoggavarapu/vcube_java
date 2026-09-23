package com.javaintro.constructors;

public class Employee {
      int  eid;
      String name;
     double  salary ;
     Employee()
     {  System.out.println("assigning values in no args ");
    	    eid=101;
    	    name="MAHITHA";
        salary=40000.00;   		
     }
    
     Employee(int eid,String name,double salary)
     {
    	       this.eid=eid;
    	      this.name=name;
    	       this.salary=salary;
     }
  //   Employee()
   //  {
 //   	   System.out.println("NO ARGS CONSTRUCTOR CALLED");
 //    }
	public static void main(String[] args) {
      Employee e=new Employee(19,"SRI",100000.00);
		e.Employeeinfo();
		Employee e1=new Employee();
	    e1.Employeeinfo();
	    
		
		
		
//	    Employee e1=new Employee();
//		e1.eid=101;
//		e1.name="MANAS";
//		e1.salary=50000.00;
//		e1.Employeeinfo();
	}
	void Employeeinfo()
	{
		System.out.println("EMPLOYEE ID IS:"+eid);
		System.out.println("EMPLOYEE NAME IS:"+name);
		System.out.println("EMPLOYEE SALARY IS:" +salary);
	}

}
