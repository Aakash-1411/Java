package test;

public class CClass extends PClass {
    public int a = 20;
    public void m(int x) {
    	System.out.println("=====CClass m(x)======");
    	System.out.println("The value x : "+x);
    }
       public void access(int x) {
    	   System.out.println("PClass value a : "+super.a);
    	   System.out.println("CClass value a : "+this.a);
    	   super.m(x);
    	   this.m(x);
       }
}
