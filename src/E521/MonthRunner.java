package E521;

import java.util.Scanner;

public class MonthRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month number : ");
        int monthNumber = scanner.nextInt();

        Month month = new Month();

        int days = month.getLength(monthNumber);

        if(days == -1){
            System.out.println("Enter a valid month number");
        }
        else{
        System.out.println("Total days : " + days);
        }
    }
}
