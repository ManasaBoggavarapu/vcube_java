package myfirstcorejavaproject;

import java.util.Scanner;

public class Tshirt {
	
		
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		String yn="Y";
		do {
		System.out.println("Enter T-shirt size:");
		int size=sc.nextInt();
		
		
		switch(size) {
		case 28 ->	System.out.println("the T-shirt description is  SMALL");
		case 30->System.out.println("the T-shirt description is X-SMALL");
		case 32-> System.out.println("the T-shirt description is MEDIUM");
		case 34->System.out.println("the T-shirt description is LARGE");
		case 36-> System.out.println("the T-shirt description is X-LARGE");
		case 38->System.out.println("the T-shirt description is XX-LARGE");
			default->System.out.println("the T-shirt description is NOT FOUND");
		}
		 System.out.println("do you want to continue !!! click Y for yes and N for no");
		  yn=sc.next();
		}while(yn.equalsIgnoreCase("Y"))	;
		
		  System.out.println(" Continue shopping");
		  
		
	}				
		
		
}	


