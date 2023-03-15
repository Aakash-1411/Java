package maccess;
 import java.util.Scanner;
public class DemoString1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = s.nextLine();
		System.out.println("str:"+str.toString());
		int len = str.length();
		System.out.println("Length of str:"+len);
		System.out.println("===Display string based on index===");
		for(int i=0;i<=len-1;i++)
		{
			char ch = str.charAt(i);
			System.out.print(ch+" ");
			
		}
		System.out.println("\n===Display string in revers order===");
		for(int i=len-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			System.out.print(ch+" ");
			
		}
		s.close();
		

	}

}
