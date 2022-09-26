package exercises;

/**
 * Leap Year Program
 *
 * @author Marko, Sander
 */

public class Leapyearprogram {
    public static void main(String[] args) {

        int year = 2022;

        // solution 1
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //solution 2 - ternary                                                                   //if  else
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");


        // solution 3- Simple!
        if(year % 4 ==0) {
            System.out.println("this is leap year");
        } else {
            System.out.println("not leap year");
        }




    }
}
