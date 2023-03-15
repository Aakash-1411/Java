package maccess;
class CTest1
{
	static
	{
		System.out.println("========StaticBlock========");
	}
	
	{
		System.out.println("========InstanceBlock========");
	}
	CTest1()
	{
		System.out.println("========ConstructorWithoutParameter========");
	}
	public  void disp()
	{
		System.out.println("========InstanceMethod========");
	}
}
public class DemoCon1 {

	public static void main(String[] args) {
		System.out.println("*********Object-1*********");
		CTest1 ob1 = new CTest1();
		ob1.disp();
		ob1.disp();
		ob1.disp();
		System.out.println("*********Object-2*********");
		CTest1 ob2 = new CTest1();
		ob2.disp();
		ob2.disp();
		ob2.disp();
		

	}

}
