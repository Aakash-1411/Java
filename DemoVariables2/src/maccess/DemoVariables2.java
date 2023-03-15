package maccess;
import test.*;
public class DemoVariables2 {
	 public int b=20;

	public static void main(String[] args) {
		int c=30;
		DemoVariables2 ob = new DemoVariables2();
		System.out.println("===========main()==========");
		System.out.println("The Value Of b = "+ob.b);
		System.out.println("The Value Of c = "+c);
		
		//calling static method m1()
		PracticeVar.m1();
		
		//create object for PracticeVar class
		PracticeVar pv = new PracticeVar();
		
		//calling non-static method m2()
		pv.m2();

	}

}
