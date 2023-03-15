package bookDetails;
import java.util.Scanner;
public class Display {
	public void disp()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter BookCode : ");
		String bCode = s.nextLine();
		System.out.println("Enter BookName : ");
		String bName = s.nextLine();
		System.out.println("Enter BookAuthor : ");
		String bAuthor = s.nextLine();
		System.out.println("Enter BookPrice : ");
		float bPrice = s.nextFloat();
		System.out.println("Enter BookQty : ");
		int bQty = s.nextInt();
		System.out.println("=======BOOK_DETAILS=========");
		System.out.println("BookCode : "+bCode);
		System.out.println("BookName : "+bName);
		System.out.println("BookAuthor : "+bAuthor);
		System.out.println("BookPrice : "+bPrice);
		System.out.println("BookQty : "+bQty);
	}

}
