package maccess;
import java.util.*;
public class Checking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] marks = new int[6];
		System.out.println("Enter "+6+" Subjects Marks : ");
		for(int i=0;i<marks.length;i++) {
			marks[i]  = s.nextInt();
		}
		System.out.println();
		int srn = 1;
		System.out.println("====Display Marks====");
		for(int j=0;j<marks.length;j++) {
			System.out.println("Subject-"+srn+"--> "+marks[j]);
			srn++;
		}
		System.out.println();
		Maximum mx = new Maximum();
		mx.maximum(marks);

		Minimum mn = new Minimum();
		mn.minimum(marks);

	}
}
