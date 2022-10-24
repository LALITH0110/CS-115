import java.util.Scanner;
public class Stopwatch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1");
		int seconds=in.nextInt();
		System.out.println("2");
		// add your code here
		int hours = seconds/3600;
		int minutes = seconds/60 - hours*60;
		int leftOver = seconds - hours*3600 - minutes*60;

		System.out.println( seconds+" seconds equals " + hours + ":" + minutes + ":" + leftOver);
	}
}