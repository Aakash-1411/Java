package maccess;
import java.util.Scanner;
public class DemoString3 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = s.nextLine();
    int len = str.length();
    String s1 = str.substring(4);
    System.out.println("S1 : "+s1.toString());
    String s2 = str.substring(2,5);
    System.out.println("S2 : "+s2.toString());
	}

}
