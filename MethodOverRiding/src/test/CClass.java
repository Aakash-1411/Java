package test;

public class CClass extends PClass {
	
	public void m1(int x) {
		System.out.println("=====CClass m1()======");
		System.out.println(x);
		super.m1(x);
	}

}
