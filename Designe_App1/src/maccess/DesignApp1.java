package maccess;
import test.*;
public class DesignApp1 {
	public static void main(String[] args) {
           ITest ob = Access.getRef();
           ob.m(123);
	}

}
