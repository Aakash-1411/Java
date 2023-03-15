package test;

public class PClass {
      public static int a = 100;
      public static void m1() {
    	  System.out.println("=====Instance m1() of PClass======");
    	  System.out.println("The Value a : "+a);
      }
      
      static
      {
    	  System.out.println("======Instance block of PClass=======");
    	  System.out.println("The Value a : "+a);
      }
}
