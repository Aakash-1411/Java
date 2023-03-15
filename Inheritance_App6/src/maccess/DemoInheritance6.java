package maccess;
import java.util.*;
import test.*;
public class DemoInheritance6 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  value x : ");
        int x = s.nextInt();
        System.out.println("Enter value y : ");
        int y = s.nextInt();
        CClass ob = new CClass();
        ob.m(x, y);
	}

}
