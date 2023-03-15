package maccess;
import java.util.Scanner;
class StudentData
{
	String rollNo,stuName,branch;
	
	
	
	public StudentData(String rn, String sname, String br)
	{
		rollNo = rn;
		stuName = sname;
		branch = br;
	}
	
	
	
	public String getStudentData()
	{
		return "Roll No : "+rollNo+"\nStudent Name : "+stuName+"\nBranch : "+branch;
	}
	
}
	
	
	class Display
	{
		public void disp(StudentData sd)
		{
			System.out.println("========Student Data========");
			 System.out.println(sd.getStudentData());
			
			
		}
	}
	

public class DemoCon6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("==========Enter Student Data========");
		System.out.println("Enter RollNo :");
		String rn = s.nextLine();
		System.out.println("Enter Student Name :");
		String sname = s.nextLine();
		System.out.println("Enter Branch :");
		String br = s.nextLine();
		StudentData sd = new StudentData(rn,sname,br);
		Display d = new Display();
		d.disp(sd);

	}

}
