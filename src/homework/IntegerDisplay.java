package homework;

import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 *
 * If given number is 4
 * 4, 44, 444, 4444
 * @author Marko
 */
public class IntegerDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to print:");
        int number = scanner.nextInt();

        System.out.println("Numbers:");
        System.out.println(number + ", " + number + number + ", " + number + number + number + ", " + number + number + number + number);
        System.out.println();
    }

}
