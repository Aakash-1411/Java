package maccess;

public class Demo1 {
    public static String getDayName(int day) {
    	String dayName = "";
    	switch(day) {
    	case 1:
    		dayName = "Monday";
    		break;
    	case 2:
    		dayName = "Tuesday";
    		break;
    	case 3:
    		dayName = "Wednesday";
    		break;
    	case 4:
    		dayName = "Thursday";
    		break;
    	case 5:
    		dayName = "Friday";
    		break;
    	case 6:
    		dayName = "Satday";
    		break;
    	case 7:
    		dayName = "Sunday";
    		break;
    	default :
    		dayName = "Invalid Day range";
    	}
    	return dayName;
    }
}
