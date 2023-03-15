package maccess;
import java.util.Scanner;
   class  Smaller
  {
	  public int small(int v1,int v2,int v3)
	  {
		  if(v1<v2 && v1<v3)
		  {
			  return v1;
		  }
		  else if(v2<v1 && v2<v3)
		  {
			  return v2;
			  
		  }
		  else 
		  {
			  return v3;
		  }
		  
	  }
  }
   class Greater
  {
	
	   public int big(int v1,int v2,int v3)
		  {
			  if(v1>v2 && v1>v3)
			  {
				  return v1;
			  }
			  else if(v2>v1 && v2>v3)
			  {
				  return v2;
				  
			  }
			  else 
			  {
				  return v3;
			  }
			  
		  }
  }
public class SmallerGreater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value 1 :");
		int v1 = s.nextInt();
		System.out.println("Enter Value 2 :");
		int v2 = s.nextInt();
		System.out.println("Enter Value 3 :");
		int v3 = s.nextInt();
		System.out.println("=====CHOICE======");
		System.out.println("1.Smaller\n2.Greater");
		System.out.println("Enter The Choice :");
		int choice = s.nextInt();
		 switch(choice)
		 {
		 case 1:
			 Smaller sm = new Smaller();
			 int r1 = sm.small(v1, v2, v3);
			 System.out.println("Samller : "+r1);
			 break;
		 case 2:
			 Greater gt = new Greater();
			 int r2 =gt.big(v1, v2, v3);
			 System.out.println("Samller : "+r2);
			 break;
			 
			 default:
				 System.out.println("Invalid Choice...");
		 }
		
	

	}

}
