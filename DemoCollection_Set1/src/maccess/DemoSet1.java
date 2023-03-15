package maccess;
import java.util.*;
public class DemoSet1 {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Set<Integer> ob = null;   //reference variable
       System.out.println("=====Choice=====");
       System.out.println("1.HashSet<E>\n2.LinkedHashSet<E>\n3.TreeSet<E>");
       System.out.println("Enter The Choice : ");
       switch(s.nextInt()) {
               case 1:
            	   ob = new HashSet<Integer>();
    	             break;
               case 2:
            	   ob = new LinkedHashSet<Integer>();
            	   break;
               case 3:
            	   ob = new TreeSet<Integer>();
            	   break;
            	   default:
            		   System.out.println("Invalid Choice...");
            		   System.exit(0);    //terminate the programming        		   
            		   }     //end of switch
                        System.out.println("Enter number integer objects ");
                        int n = s.nextInt();
                        System.out.println("Enter "+n+" Interger Objects");
                        for(int i=1;i<=n;i++) {
                        	ob.add(new Integer(s.nextInt()));     //Adding objects to Set object
                        }//end of for loop
                        System.out.println("=====Display Objects======");
                        System.out.println(ob.toString());
       s.close();
	}

}
