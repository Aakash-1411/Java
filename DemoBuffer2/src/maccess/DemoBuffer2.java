package maccess;
public class DemoBuffer2 {
	public static void main(String[] args) {
       StringBuffer sb = new StringBuffer(4);
       System.out.println("Default Capacity : "+sb.capacity());
       System.out.println("Length : "+sb.length());
       sb.append("java");
       System.out.println("String : "+sb.toString());
       System.out.println("Default Capacity : "+sb.capacity());
       System.out.println("Length : "+sb.length());
       sb.append(" is ");
       System.out.println("String : "+sb.toString());
       System.out.println("Default Capacity : "+sb.capacity());
       System.out.println("Length : "+sb.length());
       sb.append("langauge");
       System.out.println("String : "+sb.toString());
       System.out.println("Default Capacity : "+sb.capacity());
       System.out.println("Length : "+sb.length());
	}

}
