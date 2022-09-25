/**
 * Java program to find number of even and odd integers from array
 *
 * @author Marko
 */

public class Homework5B {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};

        int ctr = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                ctr++;
        }

        System.out.println("Number of even numbers: " + ctr);
        System.out.println("Number of odd numbers: " + (array.length - ctr));

    }
}
