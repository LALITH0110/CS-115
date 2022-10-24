import java.util.Scanner;
public class IsCandidate {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int satScore=in.nextInt();
    double gpa=in.nextDouble();
    int age=in.nextInt();
    boolean isCandidate;
    
    if (satScore >= 1100 && !(gpa < 2.5) && age>15) {
    	isCandidate = true;
    }
    else {
    	isCandidate = false;
    }



    System.out.println(isCandidate);
  }
}