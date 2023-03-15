package maccess;
import java.util.Scanner;
import static java.lang.Math.*;
public class DemoStaticImport {

	public static void main(String[] args) {		
     Scanner s = new Scanner(System.in);
     System.out.println("Enter The Value : ");
     int val = s.nextInt();
     double result = sqrt(val);
     System.out.println("sqrt of "+val+" is "+result);
	}

}
