package maccess;
class BTest2
{
	public int a=10;
	public static int b=20;
	{
		a++;
		b++;
		System.out.println("=======SubClass InstanceBlock========");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}	
}

public class DemoBlocks2 {
	
	     static int z=200;

	public static void main(String[] args) {
	
		System.out.println("*********Object-1*********");
		BTest2 ob1 = new BTest2();
		System.out.println("*********Object-2*********");
		BTest2 ob2 = new BTest2();
		System.out.println("**********Main()*******");
		System.out.println("Z : "+z);
	}

}
