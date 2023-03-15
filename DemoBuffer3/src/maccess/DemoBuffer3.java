package maccess;
public class DemoBuffer3 {

	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("NITHYD");
        System.out.println("String : "+sb.toString());
        System.out.println("Default Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
        sb.append("javalangaugeprogram");
        System.out.println("String : "+sb.toString());
        System.out.println("Default Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
        sb.delete(2, 10);
        System.out.println("String : "+sb.toString());
        System.out.println("Default Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
        sb.insert(2,"TASK");
        System.out.println("String : "+sb.toString());
        System.out.println("Default Capacity : "+sb.capacity());
        System.out.println("Length : "+sb.length());
	}

}
