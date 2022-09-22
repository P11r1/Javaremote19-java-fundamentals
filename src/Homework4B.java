/**
 * Java reverse array program
 *
 * @author Marko
 */

public class Homework4B {
    public static void main(String[] args) {


        int[] a = {1, 7, 3, 10, 9};
        System.out.println("Array before");
        for(int g = 0; g < a.length; g++) {
            System.out.println(a[g] + " ");
        }

        System.out.println("Array after");
        for(int g = a.length - 1; g >= 0; g--) {
            System.out.println(a[g] + " ");
        }
    }
}
