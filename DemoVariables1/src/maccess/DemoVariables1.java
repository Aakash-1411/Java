package maccess;
import test.*;
public class DemoVariables1 {
	
	 public static  int a=10;

	public static void main(String[] args) {
		
		//from main class
		System.out.println("========main()========");
		System.out.println("The Value Of a = "+a);
		
		
		//from PracticeVar class
		System.out.println("====PracticeVar Class=====");
		//calling and printing static variable
		System.out.println("x : "+PracticeVar.x);
		
		//object for PracticeVar class
		PracticeVar pv = new PracticeVar();
		//call and printing non-static variable
		System.out.println("y : "+pv.y);
	}

}
