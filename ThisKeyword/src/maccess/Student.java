package maccess;

public class Student {
    
	int id;
	String name;
	
	Student(){
		
		System.out.println("Hellooo.....!!!!!");
		
		
		
	}
	
	Student(int i,String n){
		
		this();
		
		this.id = i;
		this.name = n;
		
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String args []) {
	
	   Student s = new Student(101,"Aakash");
	}
}
