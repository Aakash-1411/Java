package test;

public class CClass extends PClass {
      public static int b = 200;
      public static void m2() {
    	  System.out.println("=======Static m2() of CClass====");
    	  System.out.println("The value of b : "+b);
      }
      
      static
      {
    	  System.out.println("=======Static block of CClass======");
    	  System.out.println("The value of b : "+b);
      }
}
