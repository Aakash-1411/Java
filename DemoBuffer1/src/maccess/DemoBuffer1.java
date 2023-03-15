package maccess;
import java.util.Scanner;
public class DemoBuffer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("Default Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("Enter the String : ");
		sb.append(s.nextLine());
		System.out.println("String : "+sb.toString());
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("Enter the String : ");
		sb.append(s.nextLine());
		System.out.println("String : "+sb.toString());
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("Enter the String : ");
		sb.append(s.nextLine());
		System.out.println("String : "+sb.toString());
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("======insert()=======");
		sb.insert(4,"NITHYD");
		System.out.println("String : "+sb.toString());
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("======delete()=======");
		sb.delete(4, 10);
		System.out.println("String : "+sb.toString());
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Length : "+sb.length());
		System.out.println("======reverse()=======");
		sb.reverse();
		System.out.println("String : "+sb.toString());
		s.close();
		
	}

}
