package test;
public class SubClass1 {
      public int a = 10;
      public static int b = 20;
      
      public void m1() {
    	  System.out.println("======OuterClass m1()======");
    	  System.out.println("a : "+a);
    	  System.out.println("b : "+b);
      }
      
      public static class SubClass2{
    	  
    	  
    	  public void m2() {
    		  System.out.println("======InnerClass NonStatic m2()=======");
    		 // System.out.println("a : "+a);
        	  System.out.println("b : "+b);
    	  }
    	  
    	  
    	  public static void m22() {
    		  System.out.println("=======InnerClass Static m22()=======");
     		  //System.out.println("a : "+a);
         	  System.out.println("b : "+b);
     	  }
      }
}
