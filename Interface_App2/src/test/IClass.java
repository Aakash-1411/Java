package test;

public class IClass {
       public void m1(int x) {
    	   System.out.println("=====Implemented m1(x)======");
    	   System.out.println("The Value X : "+x);
       }
       public void m2(int y) {
    	   System.out.println("=====Implemented m2(y)======");
    	   System.out.println("The Value Y : "+y);
       }
       public void m3(int z) {
    	   System.out.println("=====Non-Implemented m3(z)======");
    	   System.out.println("The Value X : "+z);
       }
}
