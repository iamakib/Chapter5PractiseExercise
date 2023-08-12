package E514;

import java.util.Scanner;

public class GradeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numeric grade: ");
        double numericGrade = scanner.nextDouble();

        Grade grade = new Grade(numericGrade);

        String letterGrade = grade.getLetterGrade();

        if(letterGrade.equals("Invalid Input")){
            System.out.println(letterGrade);
        }
        else{
            System.out.println("The letter grade is : " + letterGrade);
        }
    }
}
