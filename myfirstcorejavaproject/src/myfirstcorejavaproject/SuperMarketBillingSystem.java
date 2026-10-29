package myfirstcorejavaproject;

import java.util.Scanner;

public class SuperMarketBillingSystem {

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE SUPER MARKET!!!");
	   
		 Scanner sc=new Scanner(System.in);
		 String yn="";
		 double  total_price=0;
		 
		 do {
		  System.out.println("enter the category like fruits/vegetable/snacks/house hold purpose");
		  String catg=sc.next();
		 
		  
		  switch(catg) {
		  case"fruits"->{
			  String fyn="";
		  
			  do {
		  
			  System.out.println("enter the fruit item:");
			  String fruit=sc.next();
			  
			  switch(fruit) {
			  case"banana"->{
				  System.out.println("price of banana is:60-/");
				  double price=60;
				  System.out.println(" enter quantity of banana: ");
				  int quantity=sc.nextInt();
				  total_price+=price*quantity;
				  System.out.println("total price of banana is:"+(price*quantity));
				  
			  }
			  case"apple"->{
				  double price=60;
		        System.out.println("Enter quantity of Apple:");
		        int quantity = sc.nextInt();

		        total_price += (price*quantity);
		        System.out.println("Apple total: ₹" + (price*quantity));
		    }

		    case"mango" -> {
		        double price = 100;
		        System.out.println("Price of Mango is: ₹" + price);
		        System.out.println("Enter quantity of Mango:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Mango total: ₹" + (price * quantity));
		    }

		    case "orange" -> {
		        double price = 80;
		        System.out.println("Price of Orange is: ₹" + price);
		        System.out.println("Enter quantity of Orange:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Orange total: ₹" + (price * quantity));
		    }

		    case"grapes" -> {
		        double price = 90;
		        System.out.println("Price of Grapes is: ₹" + price);
		        System.out.println("Enter quantity of Grapes:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Grapes total: ₹" + (price * quantity));
		    }

		    case"pineapple" -> {
		        double price = 70;
		        System.out.println("Price of Pineapple is: ₹" + price);
		        System.out.println("Enter quantity of Pineapple:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Pineapple total: ₹" + (price * quantity));
		    }

		    case"watermelon" -> {
		        double price = 50;
		        System.out.println("Price of Watermelon is: ₹" + price);
		        System.out.println("Enter quantity of Watermelon:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Watermelon total: ₹" + (price * quantity));
		    }

		    case"papaya" -> {
		        double price = 60;
		        System.out.println("Price of Papaya is: ₹" + price);
		        System.out.println("Enter quantity of Papaya:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Papaya total: ₹" + (price * quantity));
		    }

		    case"guava" -> {
		        double price = 40;
		        System.out.println("Price of Guava is: ₹" + price);
		        System.out.println("Enter quantity of Guava:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Guava total: ₹" + (price * quantity));
		    }

		    case"pomegranate" -> {
		        double price = 150;
		        System.out.println("Price of Pomegranate is: ₹" + price);
		        System.out.println("Enter quantity of Pomegranate:");
		        int quantity = sc.nextInt();

		        total_price += price * quantity;
		        System.out.println("Pomegranate total: ₹" + (price * quantity));
		    }

		  

			  default->System.out.println("entered item of fruit is not available");
			  
			  }
			  System.out.println("do you want to continue then click y for yes or N for no:");
			  fyn=sc.next();
			  }while(fyn.equalsIgnoreCase("Y")) ;
			  
			  
		  }
		  case"vegetables"->{
			  String vyn="";
			  do {
			  System.out.println("enter vegetable name:");
			  String veg=sc.next();
			  
			  switch(veg) {
			  case"potato"->{
				  System.out.println("price of potato is:60-/");
				  double price=60;
				  System.out.println(" enter quantity of potato: ");
				  int quantity=sc.nextInt();
				  total_price+=price*quantity;
				  System.out.println("total price of banana is:"+(price*quantity));
				  
			  }
			  case"tomato" -> {
			        double price = 40;
			        System.out.println("Price of Tomato is: ₹" + price);
			        System.out.println("Enter quantity of Tomato:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Tomato total: ₹" + (price * quantity));
			    }

			    case"onion" -> {
			        double price = 50;
			        System.out.println("Price of Onion is: ₹" + price);
			        System.out.println("Enter quantity of Onion:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Onion total: ₹" + (price * quantity));
			    }

			    case"carrot" -> {
			        double price = 60;
			        System.out.println("Price of Carrot is: ₹" + price);
			        System.out.println("Enter quantity of Carrot:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Carrot total: ₹" + (price * quantity));
			    }

			    case"cabbage" -> {
			        double price = 35;
			        System.out.println("Price of Cabbage is: ₹" + price);
			        System.out.println("Enter quantity of Cabbage:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Cabbage total: ₹" + (price * quantity));
			    }

			    case"cauliflower" -> {
			        double price = 45;
			        System.out.println("Price of Cauliflower is: ₹" + price);
			        System.out.println("Enter quantity of Cauliflower:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Cauliflower total: ₹" + (price * quantity));
			    }

			    case"brinjal" -> {
			        double price = 40;
			        System.out.println("Price of Brinjal is: ₹" + price);
			        System.out.println("Enter quantity of Brinjal:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Brinjal total: ₹" + (price * quantity));
			    }

			    case"ladyfinger" -> {
			        double price = 50;
			        System.out.println("Price of Ladyfinger is: ₹" + price);
			        System.out.println("Enter quantity of Ladyfinger:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Ladyfinger total: ₹" + (price * quantity));
			    }

			    case"cucumber" -> {
			        double price = 30;
			        System.out.println("Price of Cucumber is: ₹" + price);
			        System.out.println("Enter quantity of Cucumber:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Cucumber total: ₹" + (price * quantity));
			    }

			    case"spinach" -> {
			        double price = 25;
			        System.out.println("Price of Spinach is: ₹" + price);
			        System.out.println("Enter quantity of Spinach:");
			        int quantity = sc.nextInt();

			        total_price += price * quantity;
			        System.out.println("Spinach total: ₹" + (price * quantity));
			    }
			  default->System.out.println("entered item of vegetable is not available");
			  
			  }
			  System.out.println("do you want to continue then click y for yes or N for no:");
			  vyn=sc.next();
			  
			  }while(vyn.equalsIgnoreCase("Y"));
		  } 
			default->System.out.println("enterd category is not available ");  
		  }
			 System.out.println("do you want to continue then click y for yes and n for no:"); 
			  yn=sc.next();
		  }while(yn.equalsIgnoreCase("Y"));
		  System.out.println("thanks for visiting!!!");
		  System.out.println(" grand total price is :"+total_price);
	}
}