package test;

public class CClass extends PClass{
    public static void m(int x,int y,int z) {
    	System.out.println("=======CClass m(x,y,z)======");
    	System.out.println("The value x : "+x);
    	System.out.println("The value y : "+y);
    	System.out.println("The value z : "+z);
    }
    
    public static void m(int p,float q) {
    	System.out.println("========CClass m(p,q)========");
    	System.out.println("The value p : "+p);
    	System.out.println("The value q : "+q);
    }
    
    public void access(int x,int y,int z,int p,float q) {
    	super.m(x);
    	this.m(x, y, z);
    	this.m(p, q);
    }
}
