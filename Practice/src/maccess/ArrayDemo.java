package maccess;

public class ArrayDemo {

	public static void main(String[] args) {
        
	String[] s = {"aakash","purab"};
	System.out.println(s.length);
	
	String str = "";
	
	for(int i=0;i<s.length;i++) {
		str = str+s[i];
	}
	char[] c = str.toCharArray();
	System.out.println(c.length);
	
	for(char ch:c)
		System.out.print(ch+" ");
	}

}
