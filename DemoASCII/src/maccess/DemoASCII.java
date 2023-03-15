package maccess;

public class DemoASCII {

	public static void main(String[] args) {
       System.out.println("*******UPPERCASE(A-Z)******");
       for(int i=65;i<=90;i++)
       {
    	   char ch = (char)i;
    	   System.out.print(ch+" ");
       }
       System.out.println("\n*******LOWERCASE(a-z)*******");
       for(int i=97;i<=122;i++)
       {
    	   char ch = (char)i;
    	   System.out.print(ch+" ");
       }
       System.out.println("\n*******NUMERIC(0-9)*******");
       for(int i=48;i<=57;i++)
       {
    	   char ch = (char)i;
    	   System.out.print(ch+" ");
       }
	} 
}
