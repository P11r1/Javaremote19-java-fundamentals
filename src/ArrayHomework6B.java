public class ArrayHomework6B {
    public static void main(String[] args) {
        int result = a[0];

        for (int x : a) {
            if(x > result) {
                result = x - 1;
            }
        }
        System.out.println(result);
    }
}
