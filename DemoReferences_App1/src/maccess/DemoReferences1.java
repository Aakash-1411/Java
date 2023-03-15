package maccess;
import java.util.*;
import test.*;
public class DemoReferences1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Address ad = new Address();
		Employee e = new Employee(ad);
		ReadInput r = new ReadInput();
		r.read(s, e);
		DisplayOutput d = new DisplayOutput();
		d.disp(e);
		s.close();
	}

}
