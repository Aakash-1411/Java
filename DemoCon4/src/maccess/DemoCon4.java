package maccess;
import java.util.Scanner;
class Product
{
	String pCode,pName;
	float pPrice;
	int pQty;	
}
class Display
{
	public void disp(Product p)
	{
		System.out.println("===========ProductDetails==========");
		System.out.println("ProductCode : "+p.pCode);
		System.out.println("ProductName : "+p.pName);
		System.out.println("ProductPrice : "+p.pPrice);
		System.out.println("ProductQty : "+p.pQty);
	}
}
public class DemoCon4 {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Product p = new Product();
		System.out.println("=============Enter ProductDetails==========");
		System.out.println("Enter Product Code : ");
		p.pCode = s.nextLine();
		System.out.println("Enter Product Name : ");
		p.pName = s.nextLine();
		System.out.println("Enter Product Price : ");
		p.pPrice = s.nextFloat();
		System.out.println("Enter Product Qty : ");
		p.pQty = s.nextInt();
		Display d = new Display();
		d.disp(p);
		
		
		s.close();
	}

}
