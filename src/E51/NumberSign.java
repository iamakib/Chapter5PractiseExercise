package E51;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Negative");
        }
        else if(number == 0){
            System.out.println("Zero");
        }

        else{
            System.out.println("Positive");
        }
    }
}
