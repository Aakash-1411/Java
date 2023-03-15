package test;

public class PClass {
    public PClass(int a) {
    	System.out.println("a : "+a);
    }
    public PClass(int a ,int b) {
    	this(a);
    	System.out.println("b : "+b);
    }
    
}
