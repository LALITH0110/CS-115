import java.util.*;
import java.io.*;
public class GradeStudents {
    public static void main(String[] args) throws IOException {
        // Here We create all variables that we need
        Scanner in = new Scanner(System.in);
        String line, answers ,name , highScoreNames = null , fileName;
        int commaAt;
        StringTokenizer str;
        char[] charAnswers;
        double highScore=0;


        System.out.print("Please enter the file name: ");
       
        fileName = in.nextLine();

        // First we read the File
        // The file needs to be in the same directory
        Scanner scan = new Scanner(new File(fileName));



        // We go on while loop while we have elements on the documents
        while(scan.hasNextLine()){
            // Then we go on while loop for every line of the document
            while (scan.hasNext()){
                // We read each line
                line = scan.next();
                // Here we find the position of the comma to be able to find the name
                commaAt = line.indexOf(',');
                // We use substring method to find the name of the student
                name = line.substring(0,commaAt);
                // The answers of the students will be what comes after the name and comma, that's why we put +1
                answers = line.substring(commaAt+1);
                // We use StringTokenizer to be able to split every answer of every question of the setudent
                str = new StringTokenizer(answers , ",");
                charAnswers = new char[str.countTokens()];
                while (str.hasMoreElements()) {
                    for (int i = 0; i < charAnswers.length; i++) {
                        charAnswers[i] = str.nextToken().charAt(0);
                    }
                }
                // Here we find the key, that will be used by the computer to compare answers of the students
                if ( name.equals("KEY")){
                    StudentAnswerSheet.setKey(charAnswers);
                }
                // After we set the key, we read every answer of the student and we call the StudentAnswerSheet class.
                else{
                    StudentAnswerSheet s = new StudentAnswerSheet(name, charAnswers);
                    // We output the name of student, their answer and their score
                    System.out.println(s.toString() + " score=" +s.getScore());
                    // We check who has the highest score and we keep track of the name
                    if (s.getScore() > highScore){
                        highScore = s.getScore();
                        highScoreNames = s.getName();
                    }
                    // If we have another student that also has the same high score, we add his name
                    if (s.getScore() == highScore){
                        if (highScoreNames != s.getName()){
                            highScoreNames  +=  " " + s.getName();
                        }
                    }
                }
            }
        }
        // We output the best students
        System.out.print("Best Student(s): "  + highScoreNames);
    }
}