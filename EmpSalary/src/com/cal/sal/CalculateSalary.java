package com.cal.sal;

public class CalculateSalary {
	
    public double totalSalary;
        
    public double calTotSal(int bSal) {
    	
    	totalSalary = (0.93*bSal)+(0.63*bSal)+bSal;
    	
    	return totalSalary;
    }
}
