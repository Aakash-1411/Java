package maccess;
import java.util.Scanner;
public class DemoString6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String s1 = s.nextLine().trim();
		System.out.println("Enter String2 : ");
		String s2 = s.nextLine().trim();
		System.out.println("======equals()=======");
		boolean k = s1.equalsIgnoreCase(s2);
		if(k){
			System.out.println("Strings Are Equals...");
		}
		else{
			System.out.println("Strings Are Not Equals...");
		}
		System.out.println("========CompareTo()======");
		int z = s1.compareToIgnoreCase(s2);
		if(z==0) {
			System.out.println("Strings Are Equals...");
		}
		else {
			System.out.println("Strings Are Not Equals...");
		}
	}

}
