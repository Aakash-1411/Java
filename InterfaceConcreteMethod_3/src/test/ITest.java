package test;
public interface ITest {
    public abstract void m1(int x);
    private static void m2(int y) {
    	System.out.println("======private static m2(y)======");
    	System.out.println("The value y : "+y);
    }
    
    private void m3(int z ) {
    	System.out.println("=======private non static m3()=======");
    	System.out.println("The value z : "+z);
    }
    
    public default void access(int y,int z) {
    	ITest.m2(y);
    	this.m3(z);
    	
    }
}
