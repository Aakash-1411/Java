package maccess;
import java.util.*;

import calculations.*;
public class UserChoiceOperations {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value 1 : " );
		int v1 = s.nextInt();
		System.out.println("Enter Value 2 : " );
		int v2 = s.nextInt();
		System.out.println(" =========Choice======== " );
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDiv");
		System.out.println("Enter The Choice : " );
		int choice = s.nextInt();
		
		switch(choice) {
		case 1:
			Addition ad = new Addition();
			int r1 = ad.add(v1, v2);
			System.out.println("Addition : "+r1);
			break;
			
		case 2:
			Subtraction sb = new Subtraction();
			int r2 = sb.sub(v1, v2);
			System.out.println("Subtraction : "+r2);
			break;
		case 3 :
			Multiplication Ml = new Multiplication();
			int r3 = Ml.mul(v1, v2);
			System.out.println("Multiplication : "+r3);
			break;
		case 4:
			Division dv = new Division();
			float r4 = dv.div(v1, v2);
			System.out.println("Division : "+r4);
			break;
		case 5:
			ModDiv md = new ModDiv();
			int r5 = md.moDi(v1, v2);
			System.out.println("ModDiv : "+r5);
			break;
			
			default :
				System.out.println("Invalid Choice...");
		}
		
		
		

	}

}
