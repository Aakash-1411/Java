package maccess;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str = s.nextLine();
		System.out.println("String : "+str.toString());
		int len = str.length();
		System.out.println("Length of str:"+len);
		 int count = 0;
		 System.out.println("========Vowel========");
		 for (int i=0 ; i<=len-1; i++)
		 {
	        char ch = str.charAt(i);
			 switch(ch)
			 {
			 case 'a':
			 case 'A':
				    System.out.print(ch+" ");
				    count++;
				    break;
			 case 'e':
			 case 'E':
				    System.out.print(ch+" ");
				    count++;
				    break;
			 case 'i':
			 case 'I':
				    System.out.print(ch+" ");
				    count++;
				    break;
			 case 'o':
			 case 'O':
				    System.out.print(ch+" ");
				    count++;
				    break;
			 case 'u':
			 case 'U':
				    System.out.print(ch+" ");
				    count++;
				    break;
			 }
			 
	     }
		      System.out.println("\nCount Of Vowels = "+count);
		
	      
	      
	      
		s.close();

	}
}
