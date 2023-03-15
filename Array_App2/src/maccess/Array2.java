package maccess;
import java.util.*;
public class Array2 {
     
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = Integer.parseInt(s.nextLine());
		String names[] = new String[size];
		
		//input
		System.out.println("Enter "+size+" names : ");
		for(int i=0;i<size;i++) {
		   names[i] = s.nextLine();   	
		}//end for loop
		
		//output
		System.out.println("=====OutPut=====");
		for(int i=0;i<size;i++) {
			System.out.println("name "+(i+1)+" is : "+names[i]);
		}//end for loop
		
		s.close();
	}
}
