import java.util.Scanner;
public class FindLargest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    double y = in.nextDouble();
    double z = in.nextDouble();
    // add your code here
    double largest = 0;
    if (x>y && x>z) {
    	largest = x;
    } else if (y>x && y>z) {
    	largest = y;
    } else  {
    	largest = z;
    }




    System.out.println(largest);
  }
}