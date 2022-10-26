public class Student {

    private static final char DEFAULT_GENDER = 'N';
    private static final String DEFAULT_LENGTH = "***";
    private char gender;
    private String length;

    public Student(){
        gender = DEFAULT_GENDER;
        length = DEFAULT_LENGTH;
    }
    public Student(char genderO , String newLength){
        if (genderO == 'M' || genderO == 'F' || genderO == 'N'){
            gender = genderO;
        }
        else {
            gender = DEFAULT_GENDER;
        }
        if (newLength== null){
            length = DEFAULT_LENGTH;
        }
        else {
            length = newLength;
        }

    }

    public String setRoom(String room){
        char secondChar = room.charAt(1);
        char thirdChar = room.charAt(2);
        if (secondChar >= 50 && secondChar <= 57){
            if (secondChar>= 50 && secondChar <= 52 ) {
                if (thirdChar >= 49 && thirdChar <= 54) {
                    length = room;
                }
                else {
                    length = DEFAULT_LENGTH;
                }
            }
            else if (secondChar>= 50 && secondChar<= 55){
                if (thirdChar>= 49 && thirdChar<=51){
                    length = room;
                }
                else {
                    length = DEFAULT_LENGTH;
                }
            }
            else if (secondChar>= 50 && secondChar <= 57 ) {
                if (thirdChar >= 49 && thirdChar <=50){
                    length = room;
                }
                else {
                    length = DEFAULT_LENGTH;
                }
            }
            else {
                length = DEFAULT_LENGTH;
            }
          }
        else {
            length= DEFAULT_LENGTH;
        }
        return length;

    }
    public String toString(){
        return "Gender:"+gender+" Room:"+length;
    }
}