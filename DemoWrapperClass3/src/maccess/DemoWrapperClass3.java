package maccess;
import java.util.Stack;
public class DemoWrapperClass3 {

	public static void main(String[] args) {
         Stack<Integer> ob = new Stack<Integer>();
         ob.push(new Integer(12));
         ob.push(new Integer(13));
         ob.push(new Integer(14));
         ob.push(new Integer(15));
         System.out.println(ob.toString());
         
         //Auto_Boxing
         
         Integer ob1 = 12;
         Float ob2 = 13F;
         Character ob3 = 'A';
         Boolean ob4 = true;
         System.out.println(ob1+" "+" "+ob2+" "+ob3+" "+ob4);
         //Auto_Unboxing
         
         int i = ob1;
         float f = ob2;
         char ch = ob3;
         boolean b = ob4;
         
         System.out.println("=====Display Values======");
         System.out.println("int value : "+i);
         System.out.println("float value : "+f);
         System.out.println("char value : "+ch);
         System.out.println("boolean value : "+b);
	}

}
