public class Zoning {
	double DEFAULT_LENGTH = 125.0, DEFAULT_WIDTH = 25.0;
	double 	Length, Width;
	//double LotArea = Length * Width;
	
	public Zoning(){
		Length = DEFAULT_LENGTH ;
		Width = DEFAULT_WIDTH;
	}
	
	public Zoning(int newLength, double newWigth) {
		Length = newLength;
		Width = newWigth;
	}
	
	public void setLength(double newLength){
		Length = newLength;
	}
	
	public void setWidth(double newWigth) {
		Width = newWigth;
	}
	
	public double heightLimit() {
		if( Length * Width <= 2000) {
			return 25;
		}
		else if(Length * Width > 2000 && Length * Width <= 2500) {
			return 25 + (Length * Width-2000)*.02;
		}
		else if(Length * Width > 2500 && Length * Width <= 3500){
			return 35 + (Length * Width-2500)*.01;
		}
		else if(Length * Width > 3500 && Length * Width <= 5000) {
			return 45 + (Length * Width-3500)*.005;
		}
			return 52.5 + (Length * Width-5000)*.0025;
	}
	
	
	public int unitCountLimit() {
		if( Length * Width <= 2000) {
			return 1;
		}
		else if(Length * Width > 2000 && Length * Width <= 2500) {
			return 2;
		}
		else if(Length * Width > 2500 && Length * Width <= 3500){
			return 2;
		}
		else if(Length * Width > 3500 && Length * Width <= 5000) {
			return 3;
		}
			return 4;
	}
	
	
	public String toString(){
		return "Length:" + Length +" "+ "Width:" + Width;
	}
	
	
}
