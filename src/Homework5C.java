/**
 * Java program to find duplicate values of an array of integer values
 *
 * @author Marko
 */

public class Homework5C {
    public static void main(String[] args) {

        int[] array = {1, 7, 3, 7, 10, 1, 9};

        for(int i = 0; i < array.length - 1; i++) {

            for(int j = i + 1; j < array.length; j++) {
                if((array[i] == array[j]) && (i != j)) {
                    System.out.println("Duplicates: " + array[j]);
                }
            }
        }

    }
}
