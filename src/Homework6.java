public class Homework6 {
    public static void main(String[] args) {


        int[] array = {1, 7, 3, 10, 9};
        int result = array[0];

        for(int i = 0; i < array.length; i++) {
            if(i > result) {
                result = i;
                //i--;
            }
        }
        System.out.println(result);
    }
}
