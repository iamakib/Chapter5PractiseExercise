package E518;

import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three strings");

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();


        if (string1.compareTo(string2) <= 0 && string1.compareTo(string3) <= 0) {
            System.out.println(string1);
            if (string2.compareTo(string3) <= 0) {
                System.out.println(string2);
                System.out.println(string3);
            } else {
                System.out.println(string3);
                System.out.println(string2);
            }
        } else if (string2.compareTo(string1) <= 0 && string2.compareTo(string3) <= 0) {
            System.out.println(string2);
            if (string1.compareTo(string3) <= 0) {
                System.out.println(string1);
                System.out.println(string3);
            } else {
                System.out.println(string3);
                System.out.println(string1);
            }
        } else {
            System.out.println(string3);
            if (string1.compareTo(string2) <= 0) {
                System.out.println(string1);
                System.out.println(string2);
            } else {
                System.out.println(string2);
                System.out.println(string1);
            }
        }
    }
}
