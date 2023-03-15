package test;

public class PClass {
	
	public PClass(){
		System.out.println("====PClass() Con=====");
		System.out.println();
	}
	
	public PClass(int x){
		this();
		System.out.println("====PClass() Con=====");
		System.out.println(x);
	}
   
	public void m1() {
		
		System.out.println("=====PClass m1()=======");
		System.out.println();
	}
	
	public void m1(int x) {
		this.m1();
		System.out.println("=====PClass m1(x)=======");
		System.out.println(x);
	}
}
