package maccess;

public class Minimum {
	public void minimum(int[] marks) {
		int min = marks[0];
		for(int i=0;i<6;i++) {
			if(marks[i]<min) {
				min = marks[i];
			}
		}
		System.out.println("Min Marks : "+min);
	}
}
