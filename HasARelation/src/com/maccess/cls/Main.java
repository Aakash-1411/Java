package com.maccess.cls;
import com.test.cls.*;
public class Main {
    
	public static void main(String args []) {
		
		
		Address ad = new Address("Indore","MadhyaPradesh","India");
		
		Emp e1 = new Emp(101,"Aakash",new Address("Hyderabad","Telagana","India"));
		Emp e2 = new Emp(102,"Roshan",ad);
		
		e1.display();
		e2.display();
	}
}
