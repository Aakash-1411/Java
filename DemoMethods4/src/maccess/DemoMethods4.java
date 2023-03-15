package maccess;
import java.util.Scanner;
 class EmpSal{
	public float calculate(int bSal)
	 {
		 float totSal = bSal+(0.93F*bSal)+(0.63F*bSal);
		 return totSal;
	 }

	
	}
public class DemoMethods4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		int bSal = s.nextInt();
		float hra = 0.93F*bSal;
		float da = 0.63F*bSal;
		if(bSal>=12000)
		{
			EmpSal es = new EmpSal();
			 float totSal = es.calculate(bSal);
			System.out.println("Basic Salary : "+bSal);
			System.out.println("HRA : "+hra);
			System.out.println("DA : "+da);
			System.out.println("Total Salary : "+totSal);
		}
		else
		{
			System.out.println("BasicSalary should be more than 12000...");
		}
	}

}
