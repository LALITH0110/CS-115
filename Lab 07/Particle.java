import java.text.*;
public class Particle {
	public double a,b,c,d;
	private static final DecimalFormat decimalPlaces = new DecimalFormat("0.000");
	
	public Particle(double newA , double newB, double newC , double newD) {
		a = newA;
		b = newB;
		c = newC;
		d = newD;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}
	
	public String toString() {
		return "location(t) = " + a + "t^4+" + b + "t^3+" + c + "t^2+" + d + "t";
	}
	
	public String getTable(double start, double end, double increment) {
		String line = "";
		if (start<=end && increment >0) {
			for (double i=start ; i<=end ; i = i+ increment) {
					double j = 0;
				
					j = i-increment;
					double loc = a*Math.pow(i,4) + b*Math.pow(i,3) + c*Math.pow(i,2)+ d*Math.pow(i,1);
					double loc1 = a*Math.pow(j,4) + b*Math.pow(j,3) + c*Math.pow(j,2)+ d*Math.pow(j,1);
				    double vel = 4*a*Math.pow(i,3) + 3*b*Math.pow(i,2) + 2*c*Math.pow(i,1) ;
				    if(i==start) {
				    	line += (i + ";"+decimalPlaces.format(loc)+";"+decimalPlaces.format(vel) + "\n");
				    }
				    	 else {if (loc1-loc>=1) {
						    
					    	line +=(i + ";"+decimalPlaces.format(loc)+";"+decimalPlaces.format(vel) + ";More than 1 unit movement" + "\n");
				    	 }
					     else {
					    	line += (i + ";"+decimalPlaces.format(loc)+";"+decimalPlaces.format(vel)+ "\n" );
					     }	
				    	 
				     }			    
			}
		}
		else {
			line += "getTable invalid arguments" ;   
		}
		return line ; 
	}
}

	
