/**
 * To find the second largest element in array
 *
 * @author Marko
 *
 */
public class ArrayHomework6B {
    public int findSecondLargestNumber(int[] inputArray) {
        int[] array = {1, 7, 3, 10, 9};
        int result = inputArray[0];

        for (int x : inputArray) {
            if(x > result) {
                result = x - 1;
            }
        }
        return result;
    }
}
