
public class SpinnerGame {
	
	public static void main(String[] args) {
		Spinner d = new Spinner();
		int sum = 0, evenCount = 0, value = 0;
		d.spin();
		value = d.getArrow();
		sum = sum + value;
		evenCount = evenCount + Math.abs((value%2)-1);
		d.spin();
		value = d.getArrow();
		sum = sum + value;
		evenCount = evenCount + Math.abs((value%2)-1);
		d.spin();
		value = d.getArrow();
		sum = sum + value;
		evenCount = evenCount + Math.abs((value%2)-1);
		System.out.println(sum);
		System.out.println(evenCount);
		
	}

}
