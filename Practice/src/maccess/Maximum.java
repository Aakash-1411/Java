package maccess;

public class Maximum {

	public void maximum(int[] marks) {
		int max = marks[0];
		for(int i=0;i<6;i++) {
			if(marks[i]>max) {
				max = marks[i];
			}
		}
		System.out.println("Max Marks : "+max);
	}

}
