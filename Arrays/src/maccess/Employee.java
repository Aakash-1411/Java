package maccess;

public class Employee {
	public String eid,ename,edesg;
	public int bsal,totalsal;
	public Employee(String eid,String ename,String edesg,int bsal) {
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
		this.bsal = bsal;
		this.totalsal = (int)(0.63F*bsal + 0.93F*bsal) + bsal;
		
	}
	
	public String toString() {
		return eid+"\t"+ename+"\t"+edesg+"\t"+bsal+"\t"+totalsal;
	}
}
