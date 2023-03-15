package test;
public class SubClass1 {
	public int a = 10;
	public static int b = 20;
    public void m1() {
    
	   class SubClass2{
		   
		 public void m12() {
			 System.out.println("=====Local InnerClass NonStatic m12() of m1()=====");
	    		System.out.println("a : "+a);
	    		System.out.println("b : "+b);		    	
		 }
		 
		 public static void m13() {
			 System.out.println("=====Local InnerClass Static m13() of m1()=====");
	    		//System.out.println("a : "+a);
	    		System.out.println("b : "+b);		  
		 }
	   }
	   SubClass2 ob = new SubClass2();
	   ob.m12();
	   SubClass2.m13();
   }

  
   public static void m2() {
	   
	   class SubClass3{
		   
		 public void m21() {
			 System.out.println("=====Local InnerClass NonStatic m21() of m2()=====");
	    		//System.out.println("a : "+a);
	    		System.out.println("b : "+b);		    	
		 }
		 
		 public static void m22() {
			 System.out.println("=====Local InnerClass Static m22() of m2()=====");
	    		//System.out.println("a : "+a);
	    		System.out.println("b : "+b);		  
		 }
	   }
	   SubClass3 ob = new SubClass3();
	   ob.m21();
	   SubClass3.m22();
}
}