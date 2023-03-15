package test;
public class IClass implements ITest {
       public void m1(int x) {
    	   System.out.println("=====ITest m1(x)======");
    	   System.out.println("x : "+x);
       }
       
       public void m3(int z) {
    	   System.out.println("=====IClass m3(z)=====");
    	   System.out.println("z : "+z);
       }
}
