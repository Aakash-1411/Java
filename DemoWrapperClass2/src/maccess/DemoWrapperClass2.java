package maccess;
public class DemoWrapperClass2 {

	public static void main(String[] args) {
		 //Boxing_Process
		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer("13");
		Float ob3 = new Float(49F);
		Float ob4 = new Float(20.145);
		Float ob5 = new Float("49.49F");
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("true");
		
		//Unboxing_Process
		int i1 = ob1.intValue();
		int i2 = Integer.parseInt(ob2.toString());
		float f1 = ob3.floatValue();
		double d1 = ob4.doubleValue();
		float f2 = Float.parseFloat(ob5.toString());
		char ch = ob6.charValue();
		boolean b1 = ob7.booleanValue();
		boolean b2 = Boolean.parseBoolean(ob8.toString());
		
		System.out.println("=====Display Values======");
		System.out.println("Int Value : "+i1);
		System.out.println("Int Value : "+i2);
		System.out.println("Float Value : "+f1);
		System.out.println("Double Value : "+d1);
		System.out.println("Float Value : "+f2);
		System.out.println("Char Value : "+ch);
		System.out.println("Boolean Value : "+b1);
		System.out.println("Boolean Value : "+b2);
	}

}
