/**
 * To find the second largest element in array
 *
 * @author Marko
 */
public class ArrayHomework6A {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};

        ArrayHomework6B arrayHomework6b = new ArrayHomework6B();
        int result = arrayHomework6b.findSecondLargestNumber(array);

        System.out.println("Second largest element in array: " + result);
    }
}

