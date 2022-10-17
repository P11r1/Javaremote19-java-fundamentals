package arrays;

import java.util.Random;

/**
 *
 *
 * @author Marko
 */

public class RandomEven {
    public static void main(String[] args) {
        // final - variable cannot be changed
        final int min = 0;
        final int max = 99;
        final int arrayLimit = 10;
        int[] array = new int[arrayLimit];

        //Task 1
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);
        }

    }


    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    // Display array
    //To print only odd numbers
    // Print even numbers
}
