package maccess;
import java.util.*;
public class DemoList1 {
	public static void main(String[] args) {
       System.out.println("****ArrayList()****");
       ArrayList<Integer> al1 = new ArrayList<Integer>();
       System.out.println("Size : "+al1.size());
       for(int i=1;i<=3;i++) {
    	   al1.add(new Integer(i));
       }   //end of for loop
       System.out.println(al1.toString());
	   System.out.println("Size : "+al1.size());
       System.out.println("****ArrayList(int)****");
       ArrayList<Integer> al2 = new ArrayList<Integer>(4);
       System.out.println("Size : "+al2.size());
       for(int i=1;i<=5;i++) {
    	   al2.add(new Integer(i));
       }    //end of for loop
       System.out.println(al2.toString());
	   System.out.println("Size : "+al2.size());
       System.out.println("****ArrayList(CollectionE<E>)****");
       ArrayList<Integer> al3 = new ArrayList<Integer>(al2);
       System.out.println("size : "+al3.size());
       for(int i=11;i<=13;i++) {
    	   al3.add(new Integer(i));
       }    //end of for loop
       System.out.println(al3.toString());
	   System.out.println("Size : "+al3.size());
	}

}
