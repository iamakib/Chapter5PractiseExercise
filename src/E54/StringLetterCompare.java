package E54;

import java.util.Scanner;

public class StringLetterCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter anything : ");
        String str = scanner.next();

        if(str.charAt(0) == str.charAt(str.length()-1)){
            System.out.println("first and last letter same");
        }
        else {
            System.out.println("first and last letter different");
        }
    }
}
