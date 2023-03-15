package test;

public class CClass extends PClass {
	
	public CClass(int x,int y) {
		super(x);
		System.out.println("=====CClass(x,y) Con=======");
		System.out.println(x);
		System.out.println(y);
	}
	
	public CClass(int x,int y,int z) {
		this(x,y);
		System.out.println("=====CClass(x,y,z) Con=======");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	
    
	public void m1(int x, int y) {
		super.m1(x);
		System.out.println("=====CClass m1(x,y)=======");
		System.out.println(x);
		System.out.println(y);
	}
	
	public void m1(int x,int y,int z) {
		this.m1(x, y);
		System.out.println("=====CClass m1(x,y,z)=======");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
