package E516;

import java.util.Scanner;

public class CardRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shorthand notation : ");
        String notation = scanner.next();

        Card card = new Card(notation);

        String description =  card.getDescription();

        System.out.println(description);
    }
}
