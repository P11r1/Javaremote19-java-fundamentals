/**
 * To find the second largest element in array
 *
 * @author Marko
 */
public class ArrayHomework6B {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};
        int result = array[0];

        for (int x : array) {
            if(x > result) {
                result = x - 1;
            }
        }
        System.out.println(result);
    }
}
