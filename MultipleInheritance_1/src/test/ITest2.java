package test;
public interface ITest2 {
    public abstract void m22(int y);
    public static void m2(int a) {
   	 System.out.println("=====ITest2 m2(a)=====");
   	 System.out.println("a : "+a);
    }
    
    public default void m33(int b) {
   	 System.out.println("=====ITest2 m33(b)=====");
   	 System.out.println("b : "+b);
    }
}
