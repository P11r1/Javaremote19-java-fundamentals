/**
 * Homework 3, one-line solution for FIZZBUZZ
 *
 * @author Marko
 *
 */


public class Homework3 {
    public static void main(String[] args) {
        int j = 15;
/*
        if(j % 3 == 0 && j % 5 == 0){
            System.out.println("FIZZBUZZ");
        } else if(j % 3 == 0) {
            System.out.println("FIZZ");
        } else if(j % 5 == 0) {
            System.out.println("BUZZ");
        }
*/
        //solution 2
        //Homework 3: one line for FIZZBUZZ



        System.out.println ((j % 3 == 0 && j % 5 == 0) ? "FIZZBUZZ" : (j % 3 == 0) ? "FIZZ" : (j % 5 == 0) ? "BUZZ": " ");


    }
}

