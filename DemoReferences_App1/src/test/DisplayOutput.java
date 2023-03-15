package test;
public class DisplayOutput {
      public void disp(Employee e) {
    	  System.out.println("======Display EmpDetails======");
    	  System.out.println("EmpId : "+e.id);
    	  System.out.println("EmpName : "+e.name);
    	  System.out.println("EmpDesignation : "+e.desg);
    	  System.out.println("EmpHouseNo : "+e.addr.hNo);
    	  System.out.println("StreetName : "+e.addr.streetName);
    	  System.out.println("City : "+e.addr.city);
    	  System.out.println("PinCode : "+e.addr.pinCode);
      }
}
