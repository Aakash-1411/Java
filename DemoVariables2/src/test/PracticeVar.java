package test;

public class PracticeVar {
      public static int x = 100;   //static variable
      public int y = 200;   //non-static variable
      
      public static void m1() // static method
      {   
    	  int z = 300;// local variable
    	  
    	  System.out.println("====PracticeVar static m1()======");
    	  System.out.println("x : "+x);
    	  
    	 /* System.out.println("y : "+y); y is non-static so we cannot call
    	  * y from any static method*/
    	  
    	  System.out.println("z : "+z);
      }
      
      public void m2() //non-static method
      {
    	  System.out.println("====PracticeVar non-static m2()======");
    	  System.out.println("x : "+x);
    	  System.out.println("y : "+y); 
    	  
    	 /* System.out.println("z : "+z); z is local variable from method m1
    	  * we cannot call local variable from any other method*/
      }
}
