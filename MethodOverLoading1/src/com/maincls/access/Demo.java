package com.maincls.access;

class Testing{
	
	 public static int add(int x) {
		return x;
	}
	
	static int add(int x,int y) {
		return x+y;
	}
	
}
public class Demo {

	public static void main(String[] args) {
        
		System.out.println(Testing.add(10));
		System.out.println(Testing.add(10,20));

	}

}
