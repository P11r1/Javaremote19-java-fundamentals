package homework;

public class Subtract {
    public float subtractArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result -= inputArray[i];
        }
            return result;

    }
}



















   /*

    public static void main(String[] args) {
        int[] subtract = {99, 5, 75, 3};
        int sum = 0;
        for (int i = 0; i < subtract.length; i++) {
            sum = sum - subtract[i];
        }
        System.out.println(sum);
    }
}
*/