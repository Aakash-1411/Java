package maccess;

import java.text.DecimalFormat;

public class CricketScores {
	public static String getDisplayDetails(int runs, float overs) {
		int balls = (int) (overs * 10) % 10;
		int oversInt = (int) overs;
		float runRate = (float) runs / (oversInt + (float) balls / 10);
		String runRateStr = new DecimalFormat("#.##").format(runRate);
		String result;
		
		if (runs < 100) {
			result = runs + " runs in " + (oversInt * 6 + balls) + " balls @ " + runRateStr + " runs per ball";
		} else {
			result = runs + " runs in " + oversInt + "." + balls + " Overs @ " + runRateStr + " runs per over";
		}
		
		return result;
	}

	public static void main(String[] args) {
     CricketScores.getDisplayDetails(120, 9);
	}

}
