import java.util.*;
public class EstimatePi {
    public static Random myRandomGenerator = new Random(123456789);
    public static void main(String[] args) {
   //add code here
        Scanner in= new Scanner (System.in);
        int tries = in.nextInt();
        int hits = 0;
        Point[] data = new Point [tries];
        for (int i = 0; i < tries; i++) {
            double r = myRandomGenerator.nextDouble();
            double x = -1 + 2 * r; //gets number between -1 and 1?? need to verify
            r = myRandomGenerator.nextDouble(); //dont need to redeclare r as double
            double y = -1 + 2 * r; //gets number between -1 and 1?? need to verify

            data[i] = new Point(x, y);
        }
            for (int j = 0; j <tries; j++){
                if (data[j].distanceToOrigin()<= 1) {
                    hits++;
                }


        }
            System.out.println ((4.0 * hits) / tries);

    }
}