package com.main.cls;
import com.student.info.*;
public class StudentInfo {

	public static void main(String[] args) {
		//creating 1st object for student class
       Student s1 = new Student();
       
       //assigning values to variables using 1st object
       s1.name = "Sam";
       s1.rollNo = 1;
       s1.phNo = 919632548;
       s1.address = "Hyderabad";
       
       
       //creating 2nd object for student class   
       Student s2 = new Student();
       
       //assigning values to variables using 2nd object
       s2.name = "John";
       s2.rollNo = 2;
       s2.phNo = 919632512;
       s2.address = "Mumbai";
       
       //calling both methods m1 and m2
       s1.m1();
       s2.m2();
	}

}
