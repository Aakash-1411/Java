package maccess;

public class Maximum {
	public void maximum(int[] marks) {
		if(marks[0]>marks[1] && marks[0]>marks[2] && marks[0]>marks[3] && marks[0]>marks[4] && marks[0]>marks[5]) {
			System.out.println("Max Marks : "+marks[0]);

		}else if(marks[1]>marks[0] && marks[1]>marks[2] && marks[1]>marks[3] && marks[1]>marks[4] && marks[1]>marks[5]) {
			System.out.println("Max Marks : "+marks[1]);

		}else if(marks[2]>marks[0] && marks[2]>marks[1] && marks[2]>marks[3] && marks[2]>marks[4] && marks[2]>marks[5]) {
			System.out.println("Max Marks : "+marks[2]);

		}else if(marks[3]>marks[0] && marks[3]>marks[1] && marks[3]>marks[2] && marks[3]>marks[4] && marks[4]>marks[5]) {
			System.out.println("Max Marks : "+marks[3]);

		}else if(marks[4]>marks[0] && marks[4]>marks[1] && marks[4]>marks[2] && marks[4]>marks[3] && marks[4]>marks[5]) {
			System.out.println("Max Marks : "+marks[4]);

		}else {
			System.out.println("Max Marks : "+marks[5]);
		}
	}
}
