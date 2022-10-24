import java.util.Scanner;
public class Weather {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int temperature = in.nextInt();    
    // add your code here   
   
    if (temperature > 80) {
    	System.out.println("hot");
    }
    else if (temperature >=60 && temperature <= 80) {
    	System.out.println("pleasent");
    }
    else if ( temperature < 60 && temperature >= 45 ) {
    	System.out.println("cool");
    
    }
    if ( temperature < 45) {
    	System.out.println("cold");
    }



  }
}