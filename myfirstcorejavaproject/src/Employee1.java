
public class Employee1 {
	
	static {
		  display2();
	}
	void display()
	{
		System.out.println("INSTANCE METHOD CALLED");
		
		display1();
	}
	
	void display1()
	{
		System.out.println("INSTANCE METHOD1 CALLED");
		display3();
		
	}
	
	
	static void display2()
	{ 
		Employee1 obj =new Employee1();
		System.out.println("STATIC METHOD CALLED");
		 obj.display1();
	}
	
	
	static void display3()
	{
		System.out.println("STATIC METHOD1 CALLED");
		
	
		
	}
	
	public static void main(String[] args) {
		

	}

}
