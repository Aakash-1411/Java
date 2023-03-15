package maccess;

public class DemoTypeCast {

	public static void main(String[] args) {
		//widening process
		char ch1 = 'A';
		int k = (int)ch1;
		System.out.println("ASCI value of A : "+k);
		//Narrowing process
		int z = 86;
		char ch2 = (char)z;
		System.out.println("Char At ASCI 86 : "+ch2);

	}

}
