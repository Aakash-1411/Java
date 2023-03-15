package maccess;
import java.util.*;
public class Main {
   public static void main(String args []) {
	   Student st = new Student();
	   Scanner s = new Scanner(System.in);
	   int rollNo = s.nextInt();
	   st.setRollNo(rollNo);
	   s.nextLine();
	   String name = s.nextLine();
	   st.setName(name);
	   s.close();
	   st.display();
   }
}
