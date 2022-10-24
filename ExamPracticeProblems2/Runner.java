import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Runner {
  private String name;
  private int marthonTimeSeconds;
  private static final int WORLD_RECORD_TIME_SECONDS=7299;// add expression to convert the record hours and minutes and seconds to seconds;
  private static final String DEFAULT_NAME="No Name Given" ;
  private static final NumberFormat percent = NumberFormat.getPercentInstance();

  public Runner (String n, int h, int m, int s){
    setName(n);
    setTime(h, m, s);
  }
  
  public void setName(String newName){
    if (newName!=null) {
	  name=newName;
	}
	else {
	  name=DEFAULT_NAME;
	}
  }

  public void setTime (int newH, int newM, int newS){
    if (newH>=0 && newM>=0 && newS>=0) {
	  marthonTimeSeconds = newH*3600 + newM*60 + newS;  // add expression to convert the h and m and s to seconds
	}
  }

  public String getName() { return name; }

  public int getSeconds() { return marthonTimeSeconds; }

  public String percentageSlower (){
  // ADD CODE HERE TO CALCULATE THE PERCENTAGE SLOWER THAN THE WORLD RECORD
	  double percentageSlower = ((marthonTimeSeconds*1.0)/WORLD_RECORD_TIME_SECONDS) - 1.0;
  // return the percentage slower as a percent formatted String
	  return percent.format(percentageSlower);
	  
  }

  public Runner (String n, String data){
  // ADD CODE HERE TO INITIALIZE the object attributes by using the first String argument as the player name,
	  setName (n);
	  String sHours = data.substring(0,1);
	  String sMinutes = data.substring(2,4);
	  String sSeconds = data.substring(5,7);
	  int h = Integer.parseInt(sHours);
	  int m = Integer.parseInt(sMinutes);
	  int s = Integer.parseInt(sSeconds);
	  setTime(h,m,s);
	 
	  
  // and by parsing the second colon-delimited String argument (hh:mm:ss) into 3 integers hours, minutes, seconds

  }    
}