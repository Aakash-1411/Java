package macces;
import java.util.*;
public class Soulution1 {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       
       if(n>=2 && n<=20) {
    	   for(int i=1;i<=10;i++) {
    		   int result = n*i;
    		   System.out.println(n+"x"+i+"="+result);
    	   }//end for
    	   
       }//end if
       else {
    	   System.out.println("Invalid no...");
       }//end else
       s.close();
	}

}
