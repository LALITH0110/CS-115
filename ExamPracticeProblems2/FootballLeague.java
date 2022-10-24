import java.util.Scanner;
public class FootballLeague {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    double weight = in.nextDouble();
    // add your code here
    if (age<=12 || weight<100) {
    	System.out.println("Peewee");
    } else if (age>=15 || weight>150) {
    	System.out.println("Max");
    } else {
    	System.out.println("Middle");
    }


  }
}