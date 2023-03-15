package maccess;
import java.util.Scanner;
public class SubjectMarks {
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("=======Enter The Marks========");
		System.out.println("Enter Marks Sub1 : ");
		int sub1 = s.nextInt();
		System.out.println("Enter Marks Sub2 : ");
		int sub2 = s.nextInt();
		System.out.println("Enter Marks Sub3 : ");
		int sub3 = s.nextInt();
		System.out.println("Enter Marks Sub4 : ");
		int sub4 = s.nextInt();
		System.out.println("Enter Marks Sub5 : ");
		int sub5 = s.nextInt();
		System.out.println("Enter Marks Sub6 : ");
		int sub6 = s.nextInt();
		int tMark = (sub1+sub2+sub3+sub4+sub5+sub6);
		float per = (float)tMark/6; 
		
		
		if((sub1>=0 && sub1<=100) && (sub2>=0 && sub2<=100) &&(sub3>=0 && sub3<=100) 
		   &&(sub4>=0 && sub4<=100) &&(sub5>=0 && sub6<=100) && (sub6>=0 && sub6<=100) )
		{
			System.out.println("========Marks==========");
			System.out.println("Sub1 : "+sub1);
			System.out.println("Sub2 : "+sub2);
			System.out.println("Sub3 : "+sub3);
			System.out.println("Sub4 : "+sub4);
			System.out.println("Sub5 : "+sub5);
			System.out.println("Sub6 : "+sub6);
			System.out.println("Total Marks : "+tMark);
			System.out.println("Percentage : "+per);
		}
		else
		{
			System.out.println("Invalid Marks...");
		}
	}

}
