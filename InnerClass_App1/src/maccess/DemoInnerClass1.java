package maccess;
import test.*;
public class DemoInnerClass1 {
	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();
		ob1.m1();
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();
		ob2.m2();
		SubClass1.SubClass2.m22();
	}

}
