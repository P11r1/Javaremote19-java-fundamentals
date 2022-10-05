package homework;

public class Multiply {
    public static void main(String[] args) {
        int[] multiply = {8, 45, 7, 35};
        int sum = 1;
        for (int i = 0; i < multiply.length; i++) {
            sum = sum * multiply[i];
        }


        System.out.println(sum);
    }
}
