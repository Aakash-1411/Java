package maccess;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==1 || i==2) {
				System.out.println(i);
			}else if(i==3) {
				System.out.println("*"+i+"*");
			}else if(i==4) {
				System.out.println("***"+i+"***");
			}else {
				System.out.println("****"+i+"****");
			}
		}

	}

}
