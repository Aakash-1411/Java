package test;
public class IClass implements ITest1,ITest2{
     public void m1(int x) {
    	 System.out.println("=====m1(x)=====");
    	 System.out.println("x : "+x);
     }
     
     public void m22(int y) {
    	 System.out.println("=====m22(y)=====");
    	 System.out.println("y : "+y);
     }
}
