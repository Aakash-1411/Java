package maccess;

public class Test {
	
	public static <E> void printArray(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		Box<String> box1 = new Box<>("Aakash...!");
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		box1.container = "Roshan...!";
		System.out.println(box1.getValue());

		Box<Integer> box2 = new Box<>(123);
		System.out.println(box2.getValue());
		System.out.println(box2.container.getClass().getName());
		box2.container = 345;
		System.out.println(box2.getValue());
		box2.setContainer(789);
		System.out.println(box2.getValue());
		
		Integer[] intArray = {1,2,3,4,5};
		Character[] charArray = {'A','B','C','D','E'};
		
		System.out.println("Printing Integer Array........");
		printArray(intArray);

		System.out.println("Printing Character Array........");
		printArray(charArray);
		
		 
	}

}
