package E56;

import java.util.Scanner;

public class ThreeNumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("all the same");
        }
        else if(num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("all different");
        }
        else{
            System.out.println("neither");
        }

    }
}
