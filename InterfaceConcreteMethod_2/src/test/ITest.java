package test;
public interface ITest {
     public abstract void m1(int x);
     public default void m2(int y) {
    	 System.out.println("=======Default Concrete Method=====");
    	 System.out.println("The value y : "+y);
     }
}
