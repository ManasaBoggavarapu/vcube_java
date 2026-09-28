package com.javaintro.constructors;

 class Flower {
      String name="lotus";
      
      public Flower()
      {
    	    System.out.println("no args from flower");
      }
	public static void main(String[] args) {
		System.out.println("main method started  from flower");
     //    Flower f=new Flower();
      //   f.flowerinfo();
	}
	//void flowerinfo()
	//{
	//	System.out.println("Flower name is:"+this.name);
		  
//	}

}
 public class Rose extends Flower{
         String name="rose";
       public  Rose()
         {   super();
        	    System.out.println("No args Constructor is called from Rose");
         }
		public static void main(String[] args) {
			System.out.println("MAIN METHOD STARTED");
			Rose r=new Rose();
			r.Roseinfo();
		   System.out.println("main method ended");	
		}
         void Roseinfo()
         {
        	   System.out.println("Flower name is :"+super.name);
        	   System.out.println("Flower name is :"+this.name);
         }
     
	}