package maccess;
import test.*;
public class DemoInterfaceGeneralization {
	public static void main(String[] args) {
         ITest ob = (ITest)new IClass();
         ob.m1(100);
         ob.m2(200);
        // ob.m3(300);
	}

}
