package test;

public class CClass extends PClass {
    public void m(int a,int b,int c,int d) {
    	this.m(a, b, c);
    	System.out.println("======m(a,b,c,d)======");
    	System.out.println("The value d : "+d);
    }
    
    public void m(int a,int b,int c) {
    	super.m(a, b);
    	System.out.println("======m(a,b,c=======)");
    	System.out.println("The value c : "+c);
    }
}
