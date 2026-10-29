package myfirstcorejavaproject;

import java.util.Scanner;

public class FoodOrderingSystem {




	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
		  String yn="";
		  double total_price=0;
		 
		 do {
			 
		 System.out.println("enter the category like:veg/Non-veg/starters/drinks");
		 String categ=sc.next().toLowerCase();
		
		 
		 
		
			   
			switch(categ) {
			      
			  case "veg" ->
			  {    
				  double veg_price=0;
				  String vyn="";
				  do {
				  System.out.println("ENTER THE VEG-ITEM:");
			      String veg= sc.next();
			      
			      switch(veg) {
			      
			      case "panner"-> {
			    	  System.out.println("PANNER PRICE IS:140/-rs only.");
			    	   double panner_price=140;
			    	   veg_price +=panner_price;
			    	  
			      }
			      default -> System.out.println(" enter veg item is not available");
			      
			      }
			      System.out.println("Do you want to comtinue  for vegitems click y for yes and N for no:");
			      vyn=sc.next();
			      
			      
			      
			  }while(vyn.equalsIgnoreCase("Y"));
				    System.out.println("veg total price is:"+ veg_price);
				    total_price += veg_price;
			  }
			  
			   case "non-veg" ->
			   {
				   double  nonveg_price=0;
				   String nvyn="";
				   
			       do {
			 
				   System.out.println("ENTER THE NON-VEG ITEM:");
				   String nonveg=sc.next().toLowerCase();
				
				   
			    switch(nonveg) {
			    case "chicken_biryani" ->{
			    	      System.out.println("Chicken Biryani Price is: 150");
			    	      double cb=150;
			    	      nonveg_price += cb;
			    }
			     default -> System.out.println("enter non veg item is not available !!");
			    }
			    System.out.println("do you want to continue  for non-veg itemsclick y for yes and N for no:");
			    nvyn =sc.next();
				   
			   }while(nvyn.equalsIgnoreCase("Y"));
			       System.out.println("NON VEG TOTAL PRICE IS:"+nonveg_price);
			     
				   total_price += nonveg_price;
			   } 
			   
			   
			   case "starters"->{
				   
				 double  starter_price =0;
				 String syn="";
				 do {
				   System.out.println("Enter the STARTER ITEM:");
				   String st=sc.next().toLowerCase();;
				   
				   switch(st) {
				   
				   case 	"crispy_corn"->{
					    
					   System.out.println("	Crispy Corn price is:  100 /- rs only");
					   double cc= 100;
					   starter_price += cc;
					   
				   }
				   default -> System.out.println("enter starter is not available!!");
				   }
				    System.out.println("Do you want to continue for starters click y fo yes and n for no:");
				    syn=sc.next();
			
				 } while(syn.equalsIgnoreCase("Y"));
				  System.out.println("starter total price is:"+starter_price);
				  total_price+=starter_price;
					 
			   }
			    
			   case "drinks"->{
				   String dyn="";
				   double drinkprice=0;
				  
			   do {
				   System.out.println("enter drink item:");
				   String drink=sc.next();
				
				   
				   switch(drink){
				     
				         case "sprite"->{
					   System.out.println("sprite price is: 20 -/rupees only");
					   double sp=20;
					   drinkprice+=sp;
				         }   
				   default->System.out.println("enter drink item is not available !!");
				   }
				   System.out.println("Do you want to continue  for drinks click y for yes and n for no");
				   dyn=sc.next();
				   
			   }while(dyn.equalsIgnoreCase("Y"));
				   System.out.println("Starter  total price is:"+ drinkprice);
			       total_price+= drinkprice;
			   
				   }
			   
			   default -> System.out.println("entered item of category is  not valid:");
			  
			}
			System.out.println("do you want to continue for category click yes for y and N for no:");
			 yn=sc.next();
		   }while(yn.equalsIgnoreCase("Y"));
		   
		   System.out.println("thank you for visiting");
		   System.out.println("total_price= "+total_price );
		   sc.close();
		
		 }
}	