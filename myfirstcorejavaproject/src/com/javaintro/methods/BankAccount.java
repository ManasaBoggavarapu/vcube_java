package com.javaintro.methods;

public class BankAccount {
	static int balance=1000;
	
	static  void deposit(int amount)
	{  
		 
	      balance = balance + amount;
		System.out.println("deposit is " + " " + balance);
	}
	static void withdraw(int amount)
	{
		balance= balance - amount;
		System.out.println("with draw is " +" "+ balance);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       deposit(500);
       withdraw(300);
	}

}
