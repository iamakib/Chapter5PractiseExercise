package E513;

import java.util.Scanner;

public class GradeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String gradeLetter = scanner.next();

        Grade grade = new Grade(gradeLetter);
        double gradeNumber = grade.getNumericGrade();

        if(gradeNumber == -1){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("The numeric value is " + gradeNumber);
        }

    }


}
