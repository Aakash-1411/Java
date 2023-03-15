package maccess;
import java.util.*;
public class DemoList2 {
	public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList<Integer>();
         for(int i=1;i<=5;i++) {
        	 al.add(new Integer(i));
         }    //end pf for loop
         System.out.println(al.toString());
         al.add(3,new Integer(500));    //adding by index
         System.out.println(al.toString());
         al.remove(3);     //removing by index
         System.out.println(al.toString());
         al.set(3, 700);     //replace by index
         System.out.println(al.toString());
         Integer ele = al.get(3);       //getting element by index
         System.out.println("Element at Index 3 : "+ele.toString());
         for(int i=1;i<=5;i++) {
        	 al.add(new Integer(i));
         }   //end of for loop
         System.out.println(al.toString());
         int p = al.indexOf(new Integer(5));
         System.out.println("First Index of 5: "+p);
         int q = al.lastIndexOf(new Integer(5));
         System.out.println("Last Index of 5: "+q);
         
	}

}
