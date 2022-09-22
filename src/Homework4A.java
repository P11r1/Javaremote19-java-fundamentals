/**
 * Java program to calculate the average value of array elements
 *
 * @author Marko
 */

public class Homework4A {
    public static void main(String[] args) {
        // to find the smallest element of array (b)
        int[] b = {10, 12, 1111, 25, 65000, 96, 750};

        int result = b[0];

        for (int x : b) {
            if(x < result) {
                result = x;
            }
        }
        System.out.println(result);

        //Java program to calculate average

        int[] a = {1, 7, 3, 10, 9};
        int length = a.length;
        int value = 0;
        for(int g = 0; g < a.length; g++) {
            value += a[g];
        }
        double average = value / length;
        System.out.println("average of array : " + average);


    }
}
