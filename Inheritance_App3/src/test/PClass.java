package test;

public class PClass {
      public static int a = 100;
      public static void m1() {
    	  System.out.println("=====Static m1() of PClass======");
    	  System.out.println("The Value a : "+a);
      }
      
      static
      {
    	  System.out.println("======Static block of PClass=======");
    	  System.out.println("The Value a : "+a);
      }
}
