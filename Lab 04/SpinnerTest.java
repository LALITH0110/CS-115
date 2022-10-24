public class SpinnerTest {  
	public static void main(String[] args) {
		System.out.print("Test Case 1 ");
		Spinner d1 = new Spinner();
		Spinner d2 = new Spinner(8);
		boolean a1=d1.getArrow()>=0 && d1.getArrow()<10 && d2.getArrow()>=0 && d2.getArrow()<8;
		d1.setArrow(6);
		d2.setArrow(2);
		boolean a2=d1.getArrow()==6 && d2.getArrow()==2;
		boolean a3=d1.toString().equals("Size=10 Arrow=6") && d2.toString().equals("Size=8 Arrow=2");
		if (a1 && a2 && a3) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		System.out.print("Test Case 2 (uniform randomness) ");
		int [] data = {0,0,0,0,0,0,0,0,0,0};
		Spinner d3 = new Spinner();
		for (int i=1; i<=1000000; i++) {
			d3.spin();
			data[d3.getArrow()]++;
		}
		boolean a=true;
		for (int i=0; i<10; i++) {
  			if (data[i]<90000 || data[i]>110000) a=false;
		}
		if (a) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}