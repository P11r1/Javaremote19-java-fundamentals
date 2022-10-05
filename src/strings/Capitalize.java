package strings;

import java.util.Scanner;

/**
 * To write a Java program to change string upper case
 *
 * @author Marko
 */
public class Capitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());
    }
}
