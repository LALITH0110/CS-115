import java.util.Locale;
import java.util.Scanner; 
import java.math.BigInteger;
import java.text.NumberFormat;

public class Benfords {

    public static void main(String[] args) {

        NumberFormat pctFormat = NumberFormat.getPercentInstance(Locale.US);
        Scanner scan = new Scanner(System.in);
        int n = -5;
        while (n <= 0) {

            while ( scan.hasNextInt() == false) {
                
                scan.next(); // ?? What is this for? Why do we have to input a string here?
            }
            n = scan.nextInt();
        }

        int counter=0;
            for (int i=1; i<=n; i++) {
                 if (leadingDigit(factorial(i))==1) {
                        counter++;
                }
            }
        System.out.println("Factorial first digit 1 percentage="+ pctFormat.format((1.0*counter)/n));
        
        counter=0;
            for (int i=1; i<n-1; i++) {
                if (leadingDigit(fib(i))==1) {
                        counter++;
                }
            }
            System.out.println("Fibonacci first digit 1 percentage="+pctFormat.format((1.0*counter)/n));
        }

        public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE; // initial value is 1 
            for (int i=2; i<=n; i++) {
                    result = result.multiply(BigInteger.valueOf(i));
            }
            return result; // n!
        }

        public static BigInteger fib(int n) {
            BigInteger old= BigInteger.ZERO;
            BigInteger now = BigInteger.ONE;
                if (n==0){
                    return old; // 0
                } 
                else {
                    for (int i=2; i<n; i++) {
                        // The value of variable next == old + now 
                        BigInteger next=old.add(now); 
                        old=now;
                        now=next;
                    }
                     return now;
                }
            }

        public static int leadingDigit(BigInteger n) {
            // compareTo(BigInteger val)
            // if factorial(i) ( = n! ) or fib(i) > 10, return 1
            // if factorial(i) ( = n! ) or fib(i) == 10, return 0
            // if factorial(i) ( = n! ) or fib(i) < 10, return -1
             while (n.compareTo(new BigInteger("10")) >= 0) { 
                    n = n.divide(new BigInteger("10")); // factorial(i) / 10 or fib(i) / 10
            }
            // Converts the BigInteger value into an int value
            int newn = n.intValue(); 
            return newn;
        }
}