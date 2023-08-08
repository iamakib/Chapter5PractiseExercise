package E59;

import java.util.Scanner;

public class OrderChecking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        if( (num2 >= num1 && num3 >= num2) ||(num2 >= num3 && num1 >= num2) ){
            System.out.println("in order");
        }
        else{
            System.out.println("not in order");
        }

    }
}
