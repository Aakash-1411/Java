package maccess;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = s.nextInt();
        int elements[] = new int[size];
        
        //input
        System.out.println("Enter "+size+" elements : ");
        
        for(int i=0;i<size;i++) {
        	 elements[i] = s.nextInt();
        }//end for loop
        
        //enter element which we want
        System.out.println("Enter the element which we want :  ");
        int x = s.nextInt();
        
        //output
        System.out.println("=====OutPut=====");
        
        for(int i=0;i<elements.length;i++) {
            if(elements[i]==x) {
            	
            	System.out.println("Element "+x+" found at index : "+i);
            }// end if
        	
        }//end for loop
	}
}
