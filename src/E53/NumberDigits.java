package E53;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int number = scanner.nextInt();
        if(number < 0){
            number = number * -1;
        }
        int digits=0;

        if(number < 10){
            digits = 1;
        }
        if(number >= 10){
            digits = 2;
        }
        if(number >= 100){
            digits = 3;
        }
        if(number >= 1000){
            digits = 4;
        }
        if(number >= 10000){
            digits = 5;
        }
        if(number >= 100000){
            digits = 6;
        }
        if(number >= 1000000){
            digits = 7;
        }
        if(number >= 10000000){
            digits = 8;
        }
        if(number >= 100000000){
            digits = 9;
        }
        if(number >= 1000000000){
            digits = 10;
        }

        System.out.println("Digits in number = " + digits);
    }
}
