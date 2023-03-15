package maccess;
 class BTest1
{
	  static int b=200;
	 static
	 {
		 System.out.println("=======SubClassStaticBlock======");
		 System.out.println("B : "+b);
	 }
	}
public class DemoBlocks1 {
	static int a = 100;
	public static void main(String[] args) {
		
		System.out.println("======MainMethod======");
		System.out.println("A : "+a);
		BTest1.b=500;
		System.out.println("======MainMethod======");
		System.out.println("B : "+BTest1.b);
		
	}
        static
        {
        	System.out.println("====MainClassStaticBlock=====");
        	System.out.println("A : "+a);
        }
}
