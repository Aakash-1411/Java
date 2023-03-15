package macces;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        int l;
	        System.out.println("================================");
	        for(int i=0;i<3;i++){
	            String s1=sc.next();
	            int x=sc.nextInt();
	            l=s1.length();
	            for(int j=0;j<15-l;j++)
	            {
	                s1=s1+" ";
	            }
	            System.out.print(s1);
	            if(x>=0 && x<10)
	            {
	                System.out.println("00"+x);
	            }
	            else if(x>=10 && x<100)
	            {
	                System.out.println("0"+x);
	            }
	            else
	            {
	                System.out.println(x);
	            }
	            //Complete this line
	        }
	        System.out.println("================================");
            sc.close();
	}

}
