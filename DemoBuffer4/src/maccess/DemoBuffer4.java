package maccess;
public class DemoBuffer4 {
	public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("NITHYD");
        System.out.println("=======sb1=======");
        sb1.append("java");
        System.out.println("String : "+sb1.toString());
        System.out.println("Default Capacity : "+sb1.capacity());
        System.out.println("Length : "+sb1.length());
        
        
        StringBuffer sb2 = new StringBuffer(sb1);
        System.out.println("=======sb2=======");
        System.out.println("String : "+sb2.toString());
        System.out.println("Default Capacity : "+sb2.capacity());
        System.out.println("Length : "+sb2.length());
	}

}
