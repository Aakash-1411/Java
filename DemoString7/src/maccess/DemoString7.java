 package maccess;
public class DemoString7 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println("======New Operator Process=======");
		if(s1==s2) {
			System.out.println("Strings Are Equals...");
		}
		else {
			System.out.println("Strings Are Not Equals...");
		}
		String s3 = "java";
		String s4 = "java";
		System.out.println("======String Literals Process=======");
		if(s3==s4) {
			System.out.println("Strings Are Equals...");
		}
		else {
			System.out.println("Strings Are Not Equals...");
		}
	}

}
