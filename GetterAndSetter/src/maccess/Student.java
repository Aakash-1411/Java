package maccess;

public class Student {

	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if(rollNo<=0) {
			throw new IllegalArgumentException("Invalid Args");
		}
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(this.rollNo);
		System.out.println(this.name);
	}
}
