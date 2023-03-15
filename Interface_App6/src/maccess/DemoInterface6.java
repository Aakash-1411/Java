package maccess;
import java.util.*;
import test.*;
public class DemoInterface6 {
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("===WELCOME TO ICICI BANK===");
       int count = 0;
       xyz:
       while(true) {
    	  System.out.println("Enter Pin No : ");
    	  int pinNo = s.nextInt();
    	  boolean k = new CheckPinNo().verify(pinNo);
    	  if(k) {
    		  System.out.println("=====choice=====");
    		  System.out.println("1.Withdraw\n2.Deposite");
    		  System.out.println("Enter The Choice : ");
    		  switch(s.nextInt()) {
    		  case 1:
    			  System.out.println("Enter the Amount : ");
    			  int a1 = s.nextInt();
    			  if(a1>0 && a1%100==0) {
    				  new Withdraw().process(a1);
    			  }else {
    				  System.out.println("Invalid Amount...");
    			  }
    			  break xyz;
    			   
    		  case 2:
    			  System.out.println("Enter the Amount : ");
    			  int a2 = s.nextInt();
    			  if(a2>0 && a2%100==0) {
    				  new Deposite().process(a2);
    			  }else {
    				  System.out.println("Invalid Amount...");
    			  }
    			  break xyz;
    		  }
    	  }else {
    		  System.out.println("Invalid Pin No...");
    		  count++;
    		  if(count==3) {
    			  System.out.println("Sorry...! Transaction is blocked...");
    			  break;
   		  }
   	  }
    }
  }

}
