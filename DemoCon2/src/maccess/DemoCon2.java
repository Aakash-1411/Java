package maccess;
import java.util.Scanner;
class CTest2
{
  CTest2(int x)
  {
	  System.out.println("=========CTest2(x)==========");
	  System.out.println("Value of x : "+x);
	  
  }
  void disp(int y)
  {
	  System.out.println("=========disp(y)========");
	  System.out.println("Value of y : "+y);
  }
}
public class DemoCon2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = s.nextInt();
		System.out.println("Enter the value of y : ");
		int y = s.nextInt();
		CTest2 ob = new CTest2(x);
		ob.disp(y);
	}

}
