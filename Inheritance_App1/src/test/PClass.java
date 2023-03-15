package test;

public class PClass {
      public int a = 100;
      public void m1() {
    	  System.out.println("=====Instance m1() of PClass======");
    	  System.out.println("The Value a : "+a);
      }
      
      {
    	  System.out.println("======Instance block of PClass=======");
    	  System.out.println("The Value a : "+a);
      }
}
