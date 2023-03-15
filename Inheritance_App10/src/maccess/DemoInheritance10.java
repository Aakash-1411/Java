package maccess;
import test.*;
public class DemoInheritance10 {

	public static void main(String[] args) {
         CClass ob = new CClass();
         ob.access(1, 2, 3, 4, 24.35F);
         DemoInheritance10.main(123);
	}

	public static void main(int k) {
		System.out.println("========= Overloaded main(k)======");
		System.out.println("The value k : "+k);
	}
}
