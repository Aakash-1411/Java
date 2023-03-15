package test;
public class SubClass1 {
     public static int k = 100;
     static
     {
    	 System.out.println("=====OuterClass Static Block====");
    	 System.out.println("k : "+k);
     }
     
     public static class SubClass2{
    	 public int a,b;
    	 public SubClass2(int a,int b) {
    		 this.a=a;
    		 this.b=b;
    	 }
    	 
    	 {
    		 System.out.println("=======InnerClass Instance block======");
    		 System.out.println("a : "+a);
    		 System.out.println("b : "+b);
    	 }
    	 
    	 public void m1() {
    		 System.out.println("=======InnerClass Instance m1()======");
    		 System.out.println("a : "+a);
    		 System.out.println("b : "+b);
    	 }
    	 
    	 static
    	 {
    		 System.out.println("=====InnerClass Static Block====");
        	 System.out.println("k : "+(++k)); 
    	 }
     }
}
