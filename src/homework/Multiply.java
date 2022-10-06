package homework;

public class Multiply {

    public float multiplyArray(float[] inputArray) {
            float result = 1;

            for (float input: inputArray) { // {1, 2, 3}
                result *= input; // result = result + input
            }

            return result;
        }
    }














/*
    public float addArray(float[] multiply) {

        int sum = 1;
        for (int i = 0; i < multiply.length; i++) {
            sum = sum * multiply[i];
        }


        System.out.println(sum);
    }
}
*/