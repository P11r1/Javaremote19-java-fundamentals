package homework;

public class Divide {

    public float divideArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            result /= inputArray[i];
        }

        return result;
    }
}














  /*


    public static void main(String[] args) {
        double[] divNumbers = {4, 8, 62, 3};
        double sum = 1;

        for (int i = 0; i < divNumbers.length; i++) {
            sum = sum / divNumbers[i];
        }
        System.out.println(sum);
    }
}
*/