package strings;

import java.util.Scanner;

/**
 *  To check a given word is a palindrome
 *
 * @author Marko
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //System.in because input

        System.out.println("Enter word:");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();
        //MADAM  // lenth 5 place 4 for the last char
        for (int i = word.length() -1; i >= 0; i--) {
            reverseWord.append(word.charAt(i));
        }

        if (word.equals(reverseWord.toString())) { // equals ignore case, ignores capital letter
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }

    }
}
