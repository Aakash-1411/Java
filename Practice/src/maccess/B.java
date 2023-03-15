package maccess;

public class B extends A {
    public void m() {
    	System.out.println("Child");
    }
	public static void main(String[] args) {
        A ob1 = new B();
        B ob2 = new B();
        ob1.m();
        ob2.m();

	}

}
