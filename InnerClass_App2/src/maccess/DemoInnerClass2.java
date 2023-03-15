package maccess;
import test.*;
public class DemoInnerClass2 {
	public static void main(String[] args) {
          SubClass1 ob1 = new SubClass1();
          SubClass1.SubClass2 ob2 = new SubClass1.SubClass2(10,20);
          ob2.m1();
	}

}
