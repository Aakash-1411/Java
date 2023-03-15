package com.maincls.access;

public class Student {
	
	public void m1() {
		
		System.out.println("====m1()=====");
		System.out.println();
		
	}
	
	public void m1(int i,String s) {
		
	   System.out.println("=====m1(i,s)======");
	   System.out.println(i);
	   System.out.println(s);
	}
	
	public void m1(String s , int i) {
		System.out.println("=====m1(s,i)======");
		   System.out.println(s);
		   System.out.println(i);
	}
	
	public void m1(double d , int i) {
		System.out.println("=====m1(d,i)======");
		   System.out.println(i);
		   System.out.println(d);
	}

}
