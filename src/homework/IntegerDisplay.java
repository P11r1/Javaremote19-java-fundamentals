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

        System.out.println("Numbers in order:");

        //Method 1 (baby method)
       // System.out.println(number + ", " + number + number + ", " + number + number + number + ", " + number + number + number + number);


        //Method 2
        int a = number;
        for (int i = 1; i <= 4; i++) {
            System.out.print(a + ", ");
            a = a * 10 + number;
        }
    }

}
