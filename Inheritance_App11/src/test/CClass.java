package test;

public class CClass extends PClass{
     public CClass(int a,int b,int c) {
    	 super(a,b);
    	 System.out.println("c : "+c);
     }
     
     public CClass(int a,int b,int c,int d) {
    	 this(a,b,c);
    	 System.out.println("d : "+d);
     }
}
