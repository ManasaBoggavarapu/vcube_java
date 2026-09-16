
public class Employee2 {
	int employeeid;
	int employeeage;
	double employeesalary;
	char employeegrade;
	int yearsofexperience;
	boolean employeactive;
	int NoOfleaves;
	long phonenumber;
	
	
	
	void display()
	{
		
		System.out.println("EMPLOYEE ID="+ 101);
		System.out.println("EMPLOYEE AGE="+ 45);
		System.out.println("EMPLOYEE SALARY="+ 50000.00);
		System.out.println("EMPLOYEE GRADE="+ 'A');
		System.out.println("YEARS OF EXPERIENCE="+ 24);
		System.out.println("EMPLOYEE ACTIVE="+ true);
		System.out.println("NO OF LEAVES="+ 11);
		System.out.println("PHONE NUMBER="+ 987653210);
		
	}
	public static void main(String[] args) {
		Employee2 obj=new Employee2();
		obj.display();

	}

}
