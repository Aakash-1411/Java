package test;
public class Access {
    public static ITest getRef() {
    	 class IClass implements ITest{
    		 public void m(int x) {
    			 System.out.println("======m(x)=====");
    			 System.out.println("x : "+x);
    		 }
    	 }
    	 IClass ob1 = new IClass();
		 return ob1;
    }
}
