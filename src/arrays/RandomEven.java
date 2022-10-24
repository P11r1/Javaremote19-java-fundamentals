package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 *
 * @author Marko
 */

public class RandomEven {
    public static void main(String[] args) {
        // final - variable cannot be changed
        final int min = 0; // Array starts from 0
        final int max = 99; // Array end with 99
        final int arrayLimit = 10; // Array can have only 10 numbers/places


        int[] array = new int[arrayLimit]; // Initializing new int Array

        //Task 1
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);
        }

        System.out.println("Random array:");
        displayArray(array);
        displayOddArray(array);
        displayEvenArray(array);

    }

        private static int getRandomNumber ( int min, int max){
            Random random = new Random();
            return random.nextInt(max - min) + min;
        }

        private static void displayArray(int[] inputArray) {
            System.out.println(Arrays.toString(inputArray));
        }

        private static void displayOddArray (int[] inputArray) {
            List<Integer> oddArrayList = new ArrayList<>();

            for (int number: inputArray) {
                if (number % 2 != 0) {
                    oddArrayList.add(number);
                }
            }

            System.out.println("Odd numbers of array:");
            displayArray(convertListToArray(oddArrayList));
        }

    private static void displayEvenArray (int[] inputArray) {
        List<Integer> evenArrayList = new ArrayList<>();

        for (int number: inputArray) {
            if (number % 2 == 0) {
                evenArrayList.add(number);
            }
        }

        System.out.println("Even numbers of array:");
        displayArray(convertListToArray(evenArrayList));
    }

        private static int[] convertListToArray(List<Integer> intList) {
        int[] result = new int[intList.size()];


            for (int i = 0; i < intList.size(); i++) {
                result[i] = intList.get(i);
            }
            return result;
        }
    }













     /*    System.out.println("Even numbers:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }

        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.println(array[i]);
            }

        }

    }
    */