package maccess;

public class DemoVariables3 {
      public int a=10;
      public static int b=20;
         public void m1()
         {
        	 System.out.println("========= Instance m1()========");
        	 System.out.println("The Value Of a = "+a);
        	 System.out.println("The Value Of b = "+b);
         }
        public static void m2()
         {
        	 System.out.println("========= Static m2()========");
        	// System.out.println("The Value Of a = "+a);
        	 System.out.println("The Value Of b = "+b); 
         }
	public static void main(String[] args) {
		DemoVariables3 ob = new DemoVariables3();
				ob.m1();
				DemoVariables3.m2();
		
	}

}