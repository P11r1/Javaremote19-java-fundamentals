package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user, add and print the result
 *
 * @author Marko
 */
public class InputSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in cm: ");
        int height = scanner.nextInt();

        System.out.println("How many fingers you have?");
        int number = scanner.nextInt();

        System.out.println("Height is " + height);
        System.out.println("User has " + number + " fingers");
        // !!int sum = height + number!!, can do like this also
        System.out.println("Sum is: " + (height + number));
    }
}
