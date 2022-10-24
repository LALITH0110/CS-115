import java.util.Scanner;
public class CurrentNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int currentNumber = in.nextInt();
    // add your code here    
    if (currentNumber % 2 !=0) {
    	currentNumber = (3 * currentNumber) + 1;
    	
    }
    else { if (currentNumber <= 0) {
    	currentNumber = currentNumber - (2*currentNumber);
    }
    else currentNumber = currentNumber - (2*currentNumber);
    }

 
 
 
 
    System.out.println(currentNumber);
  }
}