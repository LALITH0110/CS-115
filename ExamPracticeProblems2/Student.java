
public class Student {
	public static final char DEFAULT_GENDER= 'N';
	public static final String DEFAULT_LENGTH= "***";
	public char gender;
	private String length;
	
	public Student() {
		gender = DEFAULT_GENDER;
		length = DEFAULT_LENGTH;
		
	}
	public Student(char genderO , String newLength) {
		gender = genderO;
		length = newLength;
		if (genderO == 'M' || genderO == 'F' || genderO == 'N') {
			gender = genderO;
		} else {
			gender = DEFAULT_GENDER;
		}
		if (newLength == null) {
			length = DEFAULT_LENGTH;
		} else {
			length = newLength;
		}
	
	}
	
     public String setRoom(String room) {
    	char secondChar = room.charAt(1);
    	char thirdChar = room.charAt(2);
    	if (secondChar >= '2' && secondChar <='9' ) {
    		if (secondChar >='2' && secondChar <= '4') {
    			if (thirdChar >= '1' && thirdChar <='6') {
    				length = room;
    			} else {
    				length = DEFAULT_LENGTH;
    			}
    		} else if ( secondChar > '4' && secondChar <= '7') {
    			if (thirdChar >= '1' && thirdChar <='3') {
    				length = room;
    			} else {
    				length = DEFAULT_LENGTH;
    			}
    		}else {
    			if (thirdChar == '1' && thirdChar == '2') {
    				length = room;
    			} else {
    				length = DEFAULT_LENGTH;
    			}
    		}
    	}
    	else {
    		length = DEFAULT_LENGTH;
    	}
		return length;
	}

	public String toString() {
		return "Gender:" +gender + " " + "Room:" + length;
		}
	
	

}
