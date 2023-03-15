package maccess;
class BTest3
{
	public int a=10;
	public static int b=20;
	
	static
	{
		System.out.println("+++++++SubClass StaticBlock+++++++");
		b++;
		System.out.println("B : "+b);
	}
	
	{
		System.out.println("+++++++SubClass NonStaticBlock+++++++");
		a++;
		b++;
		System.out.println("A "+a);
		System.out.println("B : "+b);
	}
}
public class DemoBlocks3 {

	public static void main(String[] args) {
		System.out.println("========Object-1======");
		BTest3 ob1 = new BTest3();
		System.out.println("========Object-2======");
		BTest3 ob2 = new BTest3();
		

	}

}
