package maccess;

import java.util.Scanner;

public class StudentResult {
	public String generate(float per,boolean p)
	{
		if(p)
		{
			return"Fail";
		}
		else if(per>70 && per<=100)
		{
		   return"Distinction";	
		}
		else if(per>60 && per<=70)
		{
			return"First Class";
		}
		else if(per>50 && per<=60)
		{
			return"Second Class";
		}
		else if(per>35 && per<=50)
		{
			return"Third Class";
		
		}
		else
		{
			return"Fail";
		}
	}
	

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
			
			boolean p = false;
			
			
			
			if((sub1>=0 && sub1<=100) && (sub2>=0 && sub2<=100) &&(sub3>=0 && sub3<=100) 
			   &&(sub4>=0 && sub4<=100) &&(sub5>=0 && sub6<=100) && (sub6>=0 && sub6<=100) )
			{
				if(sub1<=34 || sub2<=34 || sub3<=34 || sub4<=34 || sub5<=34 || sub6<=34)
				{
					p = true;
				}
				System.out.println("========Marks==========");
				System.out.println("Sub1 : "+sub1);
				System.out.println("Sub2 : "+sub2);
				System.out.println("Sub3 : "+sub3);
				System.out.println("Sub4 : "+sub4);
				System.out.println("Sub5 : "+sub5);
				System.out.println("Sub6 : "+sub6);
				int tMark = (sub1+sub2+sub3+sub4+sub5+sub6);
				float per = (float)tMark/6; 
				StudentResult sr = new StudentResult();
				String result = sr.generate(per,p);
				System.out.println("Total Marks : "+tMark);
				System.out.println("Percentage : "+per);
				System.out.println("Result : "+result);
			}
			else
			{
				System.out.println("Invalid Marks...");
			}

		}
            

	

}
