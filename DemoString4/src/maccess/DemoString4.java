

package maccess;
import java.util.Scanner;
public class DemoString4 {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter The String : ");
      String str = s.nextLine();
      int len = str.length();
      int count=0,ab=0,num=0,sum=0;
      for(int i=0;i<=len-1;i++)
      {
    	  char ch1 = str.charAt(i);
    	  switch(ch1)
    	  {
    	  case 'a':
    	  case 'A':
    		  count++;
    		  break;
    	  case 'e':
    	  case 'E':
    		  count++;
    		  break;
    	  case 'i':
    	  case 'I':
    		  count++;
    		  break;
    	  case 'o':
    	  case 'O':
    		  count++;
    		  break;
    	  case 'u':
    	  case 'U':
    		  count++;
    		  break;
    	  }
    	  int k = (int)ch1;
    	  if((k>=65 && k<=90) || (k>=97 && k<=122))
    	  {
    		  ab++;
    	  }
    	  if(k>=48 && k<=57)
    	  {
    		  num++;
    		  char ch2 = (char)k;
    		  String s1 = String.valueOf(ch2);
    		  int z = Integer.parseInt(s1);
    		  sum=sum+z;
    	  }
      }
      System.out.println("Vowels : "+count);
      System.out.println("Consonents : "+(ab-count));
      System.out.println("Numeric : "+num);
      System.out.println("Sum : "+sum);
      System.out.println("Others : "+(len-(ab+num)));
      s.close();
	}

}
