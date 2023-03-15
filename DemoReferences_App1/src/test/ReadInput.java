package test;
import java.util.Scanner;
public class ReadInput {
       public void read(Scanner s , Employee e) {
    	   System.out.println("======Enter EmpDetails======");
    	   System.out.println("Enter EmpId : ");
    	   e.id = s.nextLine();
    	   System.out.println("Enter EmpName : ");
    	   e.name = s.nextLine();
    	   System.out.println("Enter EmpDesignation : ");
    	   e.desg = s.nextLine();
    	   System.out.println("Enter EmpHouseNo : ");
    	   e.addr.hNo = s.nextLine();
    	   System.out.println("Enter StreetName : ");
    	   e.addr.streetName = s.nextLine();
    	   System.out.println("Enter City : ");
    	   e.addr.city = s.nextLine();
    	   System.out.println("Enter PinCode : ");
    	 e.addr.pinCode = s.nextInt();
    	   
       }
}
