package test;

public class PClass {
       public void m(int a,int b) {
    	   this.m(a);
    	   System.out.println("=======m(a,b)=======");
    	   System.out.println("The value b :"+b);
       }
       
       public void m(int a) {
    	   System.out.println("======m(a)=======");
    	   System.out.println("The value a : "+a);
       }
}
