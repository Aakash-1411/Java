package maccess;
import java.util.*;
import test.*;
public class DemoInterface4 {

	public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter value x : ");
          int x = s.nextInt();
          System.out.println("Enter value y : ");
          int y = s.nextInt();
          System.out.println("Enter value z : ");
          int z = s.nextInt();
          System.out.println("======Choice======");
          System.out.println("1.Greater\n2.Smaller");
          System.out.println("Enter the Choice : ");
          switch(s.nextInt()) {
          case 1:
        	  Greater gt = new Greater();
        	  System.out.println("Greater : "+gt.compareTo(x, y, z));
        	  break;
          case 2:
        	 System.out.println("Smaller : "+new Smaller().compareTo(x, y, z));
        	  break;
        	  default :
        		  System.out.println("Invalid choice...");
        		  break;
          }
          s.close();
	}

}
