package maccess;
import java.util.Scanner;
public class DemoMethods1 {
	
	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the User_Name : ");
	  String userName = s.nextLine();
	  System.out.println("Enter the Mail_Id : ");
	  String mailId = s.nextLine();
	  System.out.println("Enter the Phone_No : ");
	  long phoneNo = s.nextLong();
	  System.out.println("==============USER_DETAILS=============");
	  System.out.println("User_Name : "+userName);
	  System.out.println("Mail_Id : "+mailId);
	  System.out.println("Phone_No : "+phoneNo);
	}

}
