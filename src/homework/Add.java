package homework;


public class Add {
    public static void main(String[] args) {
        int[] addNumbers = {2, 86, 71, 92};
        int sum = 0;
        for (int i = 0; i < addNumbers.length; i++) {
            sum = sum + addNumbers[i];
        }
        System.out.println(sum);

    }
}
