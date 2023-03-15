package maccess;
class CTest3
{
   CTest3(int x)
   {
	   System.out.println("Value of x : "+x);
   }
   
   CTest3(int x , int y)
   {
	   int ad = x+y;
	   System.out.println("Addition : "+ad);
   }
}
public class DemoCon3 {

	public static void main(String[] args) {
		
		CTest3 ob1 = new CTest3(200);
		CTest3 ob2 = new CTest3(50,50);
		
	}

}
