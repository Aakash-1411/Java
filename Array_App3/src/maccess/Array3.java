package maccess;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Array size : ");
     int size = s.nextInt();
     int numbers[] = new int[size];
     
     //input
     System.out.println("Enter "+size+" numbers : ");
     for(int i=0;i<size;i++) {
    	numbers[i] = s.nextInt(); 
     }//end for loop
     
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     
     //output
     for(int i=0;i<size;i++) {
    	
    	 if(numbers[i]<min) {
    		 min = numbers[i];
    	 }//end if
    	 
    	 if(numbers[i]>max) {
    		 max = numbers[i];
    	 }//end if
     }//end for loop
     s.close();
     
     System.out.println("======OutPut======");
     System.out.println("Smallest number is : "+min);
     System.out.println("Largest number is : "+max);
	}

}
