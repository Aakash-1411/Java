package test;

public class CClass extends PClass {
      public int b = 200;
      public void m2() {
    	  System.out.println("=======Instance m2() of CClass====");
    	  System.out.println("The value of b : "+b);
      }
      
      {
    	  System.out.println("=======Instance block of CClass======");
    	  System.out.println("The value of b : "+b);
      }
}
