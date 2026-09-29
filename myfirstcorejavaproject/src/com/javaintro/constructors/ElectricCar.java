package com.javaintro.constructors;


class Vehicle1{
    String type;
    
   Vehicle1(String type)
    {
   	 this.type=type;
   	
    }
//   public static void main(String[] args)
		{
			System.out.println("main method from Vehicle");		
//		}



class Car extends Vehicle1
{
         String brand;
         double price;
         Car( String type,String brand,double price)
         {   super(type);
            this.brand=brand;
            this.price=price;
       	   
         }
}
public class ElectricCar extends Car{ 
	
	double batterycapacity;
	ElectricCar(String type,String brand,double price,double batterycapacity)
	{   super(type,brand,price);     
		this.batterycapacity=batterycapacity;      
		
	}
	void display()
	{  
	   
	      System.out.println("TYPE OF THE Vehicle:"+type);
	      System.out.println("BRAND OF THE CAR:"+brand);
	      System.out.println("PRICE OF THE CAR:"+price);
	      System.out.println("BATTERY CAPACITY OF THE ELECTRICCAR IS:"+batterycapacity);
	}
	
	public static void main(String[] args)
	{   
       ElectricCar e= new ElectricCar("four wheeler","Kia",150000.00,45000.00);	
       e.display();
	}

}



