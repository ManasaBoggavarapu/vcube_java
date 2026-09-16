package com.javaintro;

public class Student {

	public static void main(String[] args)throws ClassNotFoundException {
		
		
		System.out.println("Main Method Started");
		System.out.println("GOOD MORNING GUYS!! HAVE A NICE DAY");
		
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javaintro.Welcome");
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		System.out.println("Main Method Ended");

	}

}
