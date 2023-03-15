package com.main.cls;
import com.cal.sal.*;
import java.util.*;
public class EmpSalary {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bSal = s.nextInt();
        if(bSal>=12000) {
        	CalculateSalary cs = new CalculateSalary();
        	double totSal = cs.calTotSal(bSal);
        	System.out.println("Basic Salary :"+bSal);
        	System.out.println("Total Salary : "+totSal);
        }//end of if
        s.close();
	}

}
