import java.util.Scanner;
import java.text.NumberFormat;
class AverageIncomeGender {
	public static void main(String[] args) 	{
		// enter your code here
		Scanner in = new Scanner(System.in);
		String gender = "";
		double income1 = 0;
		double income2 = 0;
		double sum1 = 0;
		double sum2 = 0;
		boolean justin = true; // yes justin, we love you.
		int i = 0;
		int i1 = 0;
		while(justin) {
			gender = in.next();
			if (gender.charAt(0) == 'M') {
				income1 = in.nextDouble();
				sum1 += income1;
				i++;
				
				
			} else if (gender.charAt(0) == 'F'){
				income2 = in.nextDouble();
				sum2 += income2;
				i1++;
			}  else{
				justin = false;
			}
			

		}
		if ( i == 0) {
			System.out.println("No Male Income entered");
		} else {
			System.out.println("Average Male Salary = $"+  sum1/i);
		}
		if (i1 == 0) {
			System.out.println("No Female Income entered");
		} else {
			System.out.println("Average Female Salary = $"+ sum2/i1);
		}
		
	}
}