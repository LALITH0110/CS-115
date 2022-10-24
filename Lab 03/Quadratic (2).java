import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Quadratic {
	public static void main(String[] args) {
		// add your code here   
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double costOfFence, x1 , x2, costOfFencePerm2 ;
		System.out.println("please enter values");
		a = in.nextInt();
		
		b = in.nextInt();
		
		c = in.nextInt();
		
		costOfFencePerm2 = in.nextDouble();
		
		x1 = (-b+Math.sqrt((b*b)-4*a*c))/2*a;
		x2 = (-b-Math.sqrt((b*b)-4*a*c))/2*a;
		costOfFence = (x1-x2) * costOfFencePerm2;
		
		
		DecimalFormat fivedecimal = new DecimalFormat( "##.00000");
		DecimalFormat twodecimal = new DecimalFormat("##.00");
		NumberFormat costFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println(fivedecimal.format(x1));
		System.out.println(fivedecimal.format(x2));
		System.out.println("$" + twodecimal.format(costOfFence));
		in.close();
		
		
		
	}
}
