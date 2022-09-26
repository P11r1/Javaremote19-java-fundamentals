public class Homework6 {
    public static void main(String[] args) {


        int[] a = {1, 7, 3, 10, 9};
        int result = a[0];

        for(int x : a) {
            if(x > result) {
                result = x - 1;
            }
        }
        System.out.println(result);
    }
}
