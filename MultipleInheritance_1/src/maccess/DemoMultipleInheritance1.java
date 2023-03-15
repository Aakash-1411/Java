package maccess;
import test.*;
public class DemoMultipleInheritance1 {
	public static void main(String[] args) {
            IClass ob = new IClass();
            ob.m1(100);
            ob.m22(200);
            ITest1.m2(300);
            ITest2.m2(400);
            ob.m3(500);
            ob.m33(600);
	}

}
