package E58;

import java.util.Scanner;

public class ThreeNumbersOrder2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter increasing or decreasing mode.\nstrict or lenient\nType (S/L)...");

        String str = scanner.next();

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        if (str.equals("S")) {
            if (num2 > num1 && num3 > num2) {
                System.out.println("increasing");
            } else if (num2 > num3 && num1 > num2) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither");
            }
        }
        else{
            if(num1 == num2 && num2 == num3){
                System.out.println("both increasing and decreasing");
            }
            else if (num2 >= num1 && num3 >= num2) {
                System.out.println("increasing");
            } else if (num2 >= num3 && num1 >= num2) {
                System.out.println("decreasing");
            }
        }

    }
}
