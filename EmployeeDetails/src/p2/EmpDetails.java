package p2;
import p1.EmpData;
import p1.Display;
import java.util.Scanner;
public class EmpDetails {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter EmailId=");
	String id = s.nextLine();
	System.out.println("Enter Name=");
	String nm = s.nextLine();
	System.out.println("Enter Designation=");
	String dg = s.nextLine();
	System.out.println("Enter Salary=");
	int sl = s.nextInt();
    EmpData ed = new EmpData(id,nm,dg,sl);
    Display d = new Display();
    d.dis(ed);
    s.close();
    
    		
	}

}
