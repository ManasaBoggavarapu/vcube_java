package com.javaintro.constructors;

public class BankAccount {
      long accountnumber;
      String CustomerName;
       String accountType;
       int balance;
       
       BankAccount(long accountnumber,String CustomerName,String accountType,int balance)
       {
    	   this.accountnumber=accountnumber;
    	   this.CustomerName=CustomerName;
    	   this.accountType=accountType;
    	   this.balance=balance;
    	   
       }
	public static void main(String[] args) {
		BankAccount b=new BankAccount(656766890098L,"MANASA","Savings",100000);
	    b.bankaccountinfo();
	    
	    BankAccount b1=new BankAccount(45678934567L,"SRI","Savings",5000000);
	    b1.bankaccountinfo();
	    
	}
	
	void bankaccountinfo()
	{
		System.out.println("Customer Account number is:"+accountnumber);
		System.out.println("Customer Name  is:"+CustomerName);
		System.out.println("Customer Account Type is:"+accountType);
		System.out.println("Customer Available Balance is:"+balance);
	}
	
}	
	

