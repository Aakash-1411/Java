package maccess;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of elements : ");
		int n = Integer.parseInt(s.nextLine());
		Employee[] e = new Employee[n];
		for(int i=0;i<n;i++) {
		System.out.print("Enter id : ");
		String id = s.nextLine();
		System.out.print("Enter name : ");
		String name = s.nextLine();
		System.out.print("Enter designation : ");
		String desg = s.nextLine();
		System.out.print("Enter Basic sal : ");
		int bsal = Integer.parseInt(s.nextLine());
		e[i]=new Employee(id,name,desg,bsal);
		}
		
		Spliterator<Employee> sp = Arrays.spliterator(e);
		sp.forEachRemaining((z)->{
			System.out.println(z.toString());
		});
    }

}
