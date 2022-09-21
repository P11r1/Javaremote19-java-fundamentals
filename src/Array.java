/**
 * Examples of Arrays
 *
 * @author Marko
 *
 */

public class Array {
    public static void main(String[] args) {
        int a = 9;

        // Single-Dimensional array
        //Note: Array index always start with 0
        // infinite array
        //int array
        int[] b = {9, 27, 40, 35, 839, 11000}; // That's called array, only same type( not float, double..)
        //String array     //0            1          2
        String[] fruits = {"apple", "orange", "pineapple", "", "banana", "439539"}; // index = 0, 1, 2

        System.out.println(fruits[0]);
        System.out.println(b[4]);
        System.out.println(fruits[3]); //Array index out of band

        System.out.println(b.length); // returns the number of values in the array

        System.out.println(b.length - 1); // returns arrays last index

        // Defined array
        String[] veggies = new String[5]; // new object

        veggies[3] = "potato";
        veggies[4] = "carrot";

        System.out.println(veggies[1]);

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];



        //Processing array
        //only with loops i can process the array
        //conventional for-loop
        for(int i=0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }


        //enhanced for-loop, works only for arrays and list mostly
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        //Find the largest element in the array
        // brute force method
        int result = b[0]; // result 9

        for(int x: b) {
            if(x > result){
                result = x;
            }
        }

        System.out.println(result);

        //Homework4
        // to find the smallest element in the array (b)


    }
}
