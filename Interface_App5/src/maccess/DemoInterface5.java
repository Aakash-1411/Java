package maccess;
import java.util.*;
import test.*;
public class DemoInterface5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
         System.out.println("Enter Value X : ");
         int x = s.nextInt();
         System.out.println("Enter Value Y : ");
         int y = s.nextInt();
         System.out.println("========Choice========");
         System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.ModDiv");
         System.out.println("Enter The Choice : ");
         int choice = s.nextInt();
         System.out.println("=======Result======");
         switch(choice)
         {
        	 case 1:
        		 Addition ad = new Addition();
        		 double r1 = ad.calculate(x, y);
        		 System.out.println("Result : "+r1);
        		 break;
        	 case 2:
        		 Subtraction sb = new Subtraction();
        		 double r2 = sb.calculate(x, y);
        		 System.out.println("Result : "+r2);
        		 break;
        	 case 3:
        		 Multiplication ml = new Multiplication();
        		 double r3 = ml.calculate(x, y);
        		 System.out.println("Result : "+r3);
        		 break;
        	 case 4:
        		Division dv = new Division();
        		 double r4 = dv.calculate(x, y);
        		 System.out.println("Result : "+r4);
        		 break;
        	 case 5:
        		 ModDiv md = new ModDiv();
        		 double r5 = md.calculate(x, y);
        		 System.out.println("Result : "+r5);
        		 break;
        		 default:
        			 System.out.println("Invalid Choice...");
         }
	}

}
