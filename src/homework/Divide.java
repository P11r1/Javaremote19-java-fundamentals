package homework;

public class Divide {
    public static void main(String[] args) {
        double[] divNumbers = {4, 8, 62, 3};
        double sum = 1;

        for (int i = 0; i < divNumbers.length; i++) {
            sum = sum / divNumbers[i];
        }
        System.out.println(sum);
    }
}
