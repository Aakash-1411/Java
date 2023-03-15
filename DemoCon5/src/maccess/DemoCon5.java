package maccess;
import java.util.Scanner;
class UserLogin
{     String userName,password;

       public void setuserName(String un)
       {
    	  userName = un;
       }
       
	   public void setpassword(String pw)
	   {
		   password = pw;
	   }
	   
	   public String getuserName()
	   {  
		   return userName;		  		   
	   }
	   
	   public String getpassword()
	   {
		   return password;
	   }
	   
		   
		  
	}
class Display
{
     public void disp(UserLogin ob)
     {
    	 System.out.println("=====Display UserLogin Details======");
    	 String un = ob.getuserName();
    	 String pw = ob.getpassword();
    	 System.out.println("UserName : "+un);
    	 System.out.println("UserName : "+pw);
     }
     
}
public class DemoCon5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		UserLogin ob = new UserLogin();
		System.out.println("==========Enter UserLogin Details=========");
		System.out.println("Enter UserName : ");
		String un = s.nextLine();
		ob.setuserName(un);
		System.out.println("Enter PaasWord : ");
		String pw = s.nextLine();
		ob.setpassword(pw);
		Display d = new Display();
		d.disp(ob);
		s.close();
	}

}
