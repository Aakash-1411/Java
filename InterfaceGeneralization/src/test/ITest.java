package test;
public interface ITest {
   public abstract void m1(int x);
   public default void m2(int y) {
	   System.out.println("====ITest m2(y)====");
	   System.out.println("y : "+y);
   }
}
