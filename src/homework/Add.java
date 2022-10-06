package homework;


public class Add {
   public float addArray(float[] inputArray) {
       float result = 0;

       for (float input: inputArray) { // {1, 2, 3}
           result += input; // result = result + input
       }

       return result;
   }
}















    /*public static void main(String[] args) {
        int[] addNumbers = {2, 86, 71, 92};
        int sum = 0;
        for (int i = 0; i < addNumbers.length; i++) {
            sum = sum + addNumbers[i];
        }
        System.out.println(sum);

    }
}
*/