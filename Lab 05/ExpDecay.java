import java.text.DecimalFormat;

public class ExpDecay {
	double InitialQuantity, Lambda;
	int time;
	private static final double DEFAULT_LAMBDA=0.05, DEFAULT_INITIAL_QUANTITY=100;
	
	DecimalFormat sixdecimal = new DecimalFormat( "##0.000000");
	
	public ExpDecay(){
		InitialQuantity = DEFAULT_INITIAL_QUANTITY;
		Lambda          = DEFAULT_LAMBDA;
	} 
	
	
	public ExpDecay(double newLambda, double newInitialQuantity) {
		if ( newLambda < 0 && newInitialQuantity < 0) {
			Lambda = DEFAULT_LAMBDA;
			InitialQuantity = DEFAULT_INITIAL_QUANTITY;
		}
		else if (newInitialQuantity < 0){
			Lambda = newLambda;
			InitialQuantity = DEFAULT_INITIAL_QUANTITY;
		}
		else if(newLambda < 0) {
			InitialQuantity = newInitialQuantity;
			Lambda          = DEFAULT_LAMBDA;
		}
		else {
			Lambda = newLambda;
			InitialQuantity = newInitialQuantity;
		}
	}
	
	public void setLambda(double newLambda){
		if(newLambda < 0) {
			Lambda = DEFAULT_LAMBDA;
		}
		else {
			Lambda = newLambda;
		}
	}

	public void setN0(double newInitialQuantity) {
		if (newInitialQuantity < 0) {
			InitialQuantity = DEFAULT_INITIAL_QUANTITY;
		}
		else {
			InitialQuantity = newInitialQuantity;
		}
	}

	public String toString() {
		return "Initial Quantity: " + sixdecimal.format(InitialQuantity) + "  Lambda: " + sixdecimal.format(Lambda);
	}
	
	
	public double futureQuantity(int newtime) {
		time = newtime;
		return InitialQuantity*Math.pow(Math.E,-Lambda*time);
	}
	
	public String getTable() {
		return sixdecimal.format(Lambda) +";" + sixdecimal.format(InitialQuantity) + ";" + 5 + ";" + sixdecimal.format(futureQuantity(5)) + "\n" + sixdecimal.format(Lambda) +";" + sixdecimal.format(InitialQuantity) + ";" + 25 + ";" + sixdecimal.format(futureQuantity(25)) + "\n" + sixdecimal.format(Lambda) +";" + sixdecimal.format(InitialQuantity) + ";" + 50 + ";" + sixdecimal.format(futureQuantity(50)) + "\n";
	}
}