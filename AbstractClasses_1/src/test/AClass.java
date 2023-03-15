package test;
public abstract class AClass {
       public abstract void m1(int x);
       public void m2(int y) {
          System.out.println("======AClass m2(x)======");
          System.out.println("y : "+y);
       }
}
