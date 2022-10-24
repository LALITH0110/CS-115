public class ExpDecayTest {  
  public static void main(String[] args) {
    System.out.print("Test Case 1 ");
    ExpDecay value1 = new ExpDecay();
    boolean a1=value1.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
    value1.setLambda(.025);
    value1.setN0(10);
    boolean a2=value1.toString().equals("Initial Quantity: 10.000000  Lambda: 0.025000");
    if (a1 && a2) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }

    System.out.print("Test Case 2 ");
    ExpDecay value2 = new ExpDecay();
    boolean a3=Math.abs(value2.futureQuantity(1)-95.1229424500714)<.00000001;
    value2.setLambda(.025);
    value2.setN0(10);
    boolean a4=Math.abs(value2.futureQuantity(1)-9.753099120283327)<.00000001;
    if (a3 && a4) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }

    System.out.print("Test Case 3 ");
    ExpDecay value3 = new ExpDecay(.05, 10000);
    boolean  a5 = value3.getTable().equals("0.050000;10000.000000;5;7788.007831\n0.050000;10000.000000;25;2865.047969\n0.050000;10000.000000;50;820.849986\n");
    value3.setLambda(.06);
    value3.setN0(8000);
    boolean  a6 = value3.getTable().equals("0.060000;8000.000000;5;5926.545765\n0.060000;8000.000000;25;1785.041281\n0.060000;8000.000000;50;398.296547\n");
    if (a5 && a6) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }
  }
}