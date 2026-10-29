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
			      
			      case"panner"-> {
			    	  System.out.println("PANNER PRICE IS:140/-rs only.");
			    	   double panner_price=140;
			    	   veg_price +=panner_price;
			      }
			      
			      case"veg_manchurian"-> {
			      	
			      
			    	  System.out.println("veg_manchurian PRICE IS:120/-rs only.");
			    	   double vg =120;
			    	   veg_price +=vg;
			      }
			      
			      case"gobi_manchurian"-> {
				      
				    	  System.out.println(" gobi_manchurian PRICE IS:150/-rs only.");
				    	   double 	gb=150;
				    	   veg_price += gb;
				      }
				      
			      case"aloo_gobi"->{
				      
				    	  System.out.println("aloo_gobi PRICE IS:130/-rs only.");
				    	   double 	ab=130;
				    	   veg_price += ab;
				      }
			    	   
			      case"veg_biryani"-> {
				    	  System.out.println(" veg_biryani PRICE IS:160/-rs only.");
				    	   double 	vg=160;
				    	   veg_price += vg;
				      }
			    	   
			      case"mushroom_curry"-> {
				      	
				    	  System.out.println(" mushroom_curry PRICE IS:50/-rs only.");
				    	   double 	mc=50;
				    	   veg_price += mc ;
				      }
			      
			      case"dal_fry"-> {
				     
				    	  System.out.println(" 	dal_fry PRICE IS:60/-rs only.");
				    	   double 	df=60;
				    	   veg_price += df ;
				      }
			      case"vegfried_rice"-> {
				    
				    	  System.out.println(" 	vegfried_rice PRICE IS:60/-rs only.");
				    	   double 	vfr=60;
				    	   veg_price += vfr ;
				      }
			      
			      
			      case"malai_kofta"-> {
					    
			    	  System.out.println(" malai_kofta PRICE IS:160/-rs only.");
			    	   double 	mkf=160;
			    	   veg_price += mkf ;
			      }
		      
			      
			      case"methi_chaman"-> {
					    
			    	  System.out.println(" 	methi_chaman PRICE IS:170/-rs only.");
			    	   double 	mch=170;
			    	   veg_price += mch ;
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
			    
			    case"chicken_biryani" ->{
			    	      System.out.println("Chicken Biryani Price is: 150");
			    	      double cb=150;
			    	      nonveg_price += cb;
			    }
			    
			    case"mutton_biryani" ->{
		    	      System.out.println("mutton Biryani Price is: 450");
		    	      double mb=450;
		    	      nonveg_price += mb;
		    }
			    
			    
			    case"prawns_biryani" ->{
		    	      System.out.println("prawns Biryani Price is: 300");
		    	      double pb=300;
		    	      nonveg_price += pb;
		    }
			   
			    
			    case"chicken_roast_biryani" ->{
		    	      System.out.println("Chicken_roast Biryani Price is: 230");
		    	      double crb=230;
		    	      nonveg_price += crb;
		    }
			    
			    case"chicken_joint_biryani" ->{
		    	      System.out.println("Chicken_joint  Biryani Price is: 250");
		    	      double cjb=250;
		    	      nonveg_price += cjb;
		    }
			    
			    case"chicken_mandi" ->{
		    	      System.out.println("Chicken mandi Price is: 1150");
		    	      double cmd=1150;
		    	      nonveg_price += cmd;
		    }
			    
			    case"chicken_thikka" ->{
		    	      System.out.println("Chicken thikka Price is: 200");
		    	      double ct=200;
		    	      nonveg_price += ct;
		    }
			    
			    case"fish_biryani" ->{
		    	      System.out.println("fish Biryani Price is: 250");
		    	      double fb=250;
		    	      nonveg_price += fb;
		    }
			    
			    case"chicken_65" ->{
		    	      System.out.println("Chicken 65 Price is: 450");
		    	      double c65=450;
		    	      nonveg_price += c65;
		    } 
			    
			    case"chicken_friedrice" ->{
		    	      System.out.println("Chicken fried rice Price is: 150");
		    	      double cfr=150;
		    	      nonveg_price += cfr;
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
				   
				   case"crispy_corn"->{
					    
					   System.out.println("	Crispy Corn price is:  100 /- rs only");
					   double cc= 100;
					   starter_price += cc;
				   }
				   case"veg_manchurian"->{
					    
					   System.out.println("	veg_manchurian price is:  60 /- rs only");
					   double vm= 60;
					   starter_price += vm;   
				   }   
					   
				   case"french_fries"->{
					    
					   System.out.println("french_fries price is:  130 /- rs only");
					   double ff= 130;
					   starter_price += ff;   
				   }   
					  
				   
				   case"spring_rolls"->{
					    
					   System.out.println("	spring_rolls price is:  140 /- rs only");
					   double sr= 140;
					   starter_price += sr;   
				   } 
				   
				   
				   case"chilli_paneer"->{
					    
					   System.out.println("chilli_paneer is:  170 /- rs only");
					   double cp= 170;
					   starter_price += cp;   
				   } 
				   
				   case"baby_corn_fry"->{
					    
					   System.out.println("baby_corn_fry is:  150 /- rs only");
					   double bcf= 150;
					   starter_price += bcf;   
				   } 
				   case"onion_pakoda"->{
					    
					   System.out.println("onion pakoda is:  50 /- rs only");
					   double bcf= 50;
					   starter_price += bcf;   
				   } 
				   case"chicken_manchurian"->{
					    
					   System.out.println("chicken manchurian is:  120 /- rs only");
					   double cm= 120;
					   starter_price += cm; 
				   }   
					   
				   case"panner_thikka"->{
					    
					   System.out.println("panner_thikka price is:  140 /- rs only");
					   double sr= 140;
					   starter_price += sr;   
				   } 
				      
				   case"cheese_balls"->{
					    
					   System.out.println("cheese_balls price is:  120 /- rs only");
					   double sr= 120;
					   starter_price += sr;   
				   }   
					 
				   case"chicken_lollipop"->{
					    
					   System.out.println("chicken lollipop price is:  190 /- rs only");
					   double sr= 190;
					   starter_price += sr;   
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
				     
				         case"sprite"->{
					            System.out.println("sprite price is: 20 -/rupees only");
					            double sp=20;
					            drinkprice+=sp;
					   
				         }
				         case"coco_cola"->{
							   System.out.println("coco_cola price is: 30 -/rupees only");
							   double cc=30;
							   drinkprice+=cc;
				         }
				         
				         case"thums_up"->{
							   System.out.println("thumbs_up price is: 25 -/rupees only");
							   double tu=25;
							   drinkprice+=tu;
				         }
				         
				         case "goli_soda"->{
							   System.out.println("goli soda price is: 30 -/rupees only");
							   double gs=30;
							   drinkprice+=gs;
				         }
				         
				         case"maaza"->{
							   System.out.println("maaza price is: 40 -/rupees only");
							   double mz=40;
							   drinkprice+=mz;
				         }
				         case "fizz"->{
							   System.out.println("fizz price is: 25 -/rupees only");
							   double fz=25;
							   drinkprice+=fz;
				         }
				         
				         case"limca"->{
							   System.out.println("limca price is: 35-/rupees only");
							   double lm=35;
							   drinkprice+=lm;
				         }
				         
				         case "fruity"->{
							   System.out.println("fruity price is: 45 -/rupees only");
							   double ft=45;
							   drinkprice+=ft;	   
				         }
				         
				         case"cold_coffee"->{
							   System.out.println("cold coffee price is: 80-/rupees only");
							   double cc=80;
							   drinkprice+=cc;
				         }	   
				         
				         case"chocolate_milkshake"->{
							   System.out.println("chocolate_milkshake price is: 180 -/rupees only");
							   double cm=20;
							   drinkprice+=cm;  
				         }
				         
				         case"strawberry_milkshake"->{
							   System.out.println("strawberry_milkshake price is: 200 -/rupees only");
							   double sm=200;
							   drinkprice+=sm;   
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
