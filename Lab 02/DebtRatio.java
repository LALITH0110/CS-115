package LAB2;

import java.util.Scanner;
public class DebtRatio {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("please input income");
			double income=in.nextDouble();
			
			System.out.println("please inout Other Monthly Debt");
			double otherMonthlyDebt=in.nextDouble();
			
			// add your code here
			double lowLimit, highLimit; //Make the lowLimit and HighLimit able to show the decimal points
			final double low_pct=.36, high_pct=.42; // the percentage is permanent
			
			lowLimit = (low_pct*income)-otherMonthlyDebt;
			highLimit = (high_pct*income)-otherMonthlyDebt;
					
			
			System.out.println( "Lower Limit: $" + lowLimit);  //formatted output not required
			System.out.println( "High Limit: $" + highLimit);  //formatted output not required
		}
	}

