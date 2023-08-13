package E519;

import java.util.Scanner;

public class FloatingPointMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two floating-point numbers:");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double number1Round = Math.round(number1 * 100) /100.0;
        double number2Round = Math.round(number2 * 100) /100.0;

        if(number1Round == number2Round){
            System.out.println("They are the same up to two decimal places.");
        }
        else{
            System.out.println("They are different.");
        }
    }
}
