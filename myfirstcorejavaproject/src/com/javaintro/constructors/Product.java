package com.javaintro.constructors;

public class Product {
	 String productname;
	 int productid;
	 double price;
	 int quantity;
	Product( String productname, int productid,double price,int quantity)
	{
		this.productname=productname;
		this.productid=productid;
		this.price=price;
		this.quantity=quantity;
		
	}
	Product(double price,int quantity,Product p)
	{    this.productname=p.productname;
	     this.productid=p.productid;
		 this.price=price;
		 this.quantity=quantity;
		
	}
	 

	public static void main(String[] args) {
		Product p=new Product("laptop",238,70000.00,1);
		p.display();
		System.out.println("****************************8");
		
		Product p1=new Product(56000.00,23,p);
		p1.display();
		
		

	}
	void display()
	{
		System.out.println("product name is:"+productname);
		System.out.println("product id is:"+productid);
		System.out.println("product price is:"+price);
		System.out.println("quantity of product:"+quantity);
	}

}

