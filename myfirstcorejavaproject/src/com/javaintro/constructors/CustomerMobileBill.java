package com.javaintro.constructors;

public class CustomerMobileBill {

     String Mobilemodel;
     int price;
     int quantity;
     double mobilecost;
     double deliverycharge;
     double finalbill;
     
     CustomerMobileBill()
     {
    	    this("VIVO Y400 5G");
    	   System.out.println("NO ARGS CONSTRUCTOR CALLED");
     }
     
     CustomerMobileBill(String Mobilemodel)
     {
    	     this( Mobilemodel,30000);
    	     System.out.println("1 ARGS CONSTRUCTOR CALLED");
     }
     
     CustomerMobileBill(String Mobilemodel,int price)
     {
    	    this(Mobilemodel,price,1);
    	    System.out.println("2 ARGS CONSTRUCTOR CALLED");
     } 
     CustomerMobileBill(String Mobilemodel,int price,int quantity)
     {        this(Mobilemodel, price, quantity, 500000);
    	          System.out.println("3 ARGS CONSTUCTOR CALLED");
    	         
     }
     CustomerMobileBill(String Mobilemodel,int price,int quantity, double mobilecost)
     {
    	     
    	      this(Mobilemodel, price, quantity, mobilecost,30000.00);
    	     System.out.println("4 ARGS CONSTRUCTOR CALLED");
     }
     CustomerMobileBill(String Mobilemodel,int price,int quantity, double mobilecost, double deliverycharge )
     {    this(Mobilemodel, price, quantity, mobilecost,deliverycharge,500000.00);
    	        System.out.println("5 ARGS CONSTRUCTOR CALLED");
    		 
    	 }
     CustomerMobileBill(String Mobilemodel,int price,int quantity, double mobilecost, double deliverycharge, double finalbill )
     {
    	 mobilecost=price*quantity;
      finalbill=mobilecost*deliverycharge;
    	 this.Mobilemodel=Mobilemodel;
    	 this.price=price;
       this.quantity=quantity;
       this.mobilecost=mobilecost;
       this.deliverycharge=deliverycharge;
       this.finalbill=finalbill;
      
     }
	public static void main(String[] args) {
		CustomerMobileBill c= new CustomerMobileBill();
        c.Customermobilebillinfo();
	}
    void Customermobilebillinfo()
    {
    	 System.out.println("CUSTOMER MOBILEMODEL IS:"+Mobilemodel);
    	 System.out.println("CUSTOMER MOBILEPRICE  IS:"+price);
    	 System.out.println("MOBILE QUANTITY  IS:"+quantity);
    	 System.out.println("CUSTOMER MOBILECOST  IS:"+mobilecost);
    	 System.out.println("Mobile DELIVERY CHARGE  IS:"+deliverycharge);
    	 System.out.println("MOBILE FINAL BILL IS:"+finalbill);
    	 
    }
}
