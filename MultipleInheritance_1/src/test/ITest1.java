package test;
public interface ITest1 {
     public abstract void m1(int x);
     public static void m2(int a) {
    	 System.out.println("=====ITest1 m2(a)=====");
    	 System.out.println("a : "+a);
     }
     
     public default void m3(int b) {
    	 System.out.println("=====ITest1 m3(b)=====");
    	 System.out.println("b : "+b);
     }
}
