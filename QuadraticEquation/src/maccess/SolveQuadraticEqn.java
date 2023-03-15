package maccess;
import java.util.Scanner;
public class SolveQuadraticEqn {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.close();
        
        double result = (b*b) - (4.0*a*c);
        
        if(result>0.0) {
        	double r1 = (-b+(Math.pow(result, 0.5))/2.0*a);
        	double r2 = (-b-(Math.pow(result, 0.5))/2.0*a);
        	
        	System.out.println("Roots are : "+r1+" and "+r2);
        }else if(result==0) {
        	double r1 = -b/(2.0 * a);
        	
        	System.out.println("Root is : "+r1);
        }else {
        	System.out.println("The equation has no real roots");
        }
	}

}
