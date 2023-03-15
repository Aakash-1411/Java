package p1;

public class EmpData {
	
		public String eId,name,desg;
		public int sal;
		
	public EmpData(String id,String nm, String dg, int sl)
	
	{
		eId=id;
		name=nm;
		desg=dg;
		sal=sl;
		
	}
	public String getEmpData()
	{
		return "EmailId="+eId+"\nName="+name+"\nDesignation="+desg+"\nSal="+sal;
	}

}
