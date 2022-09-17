/**
 * Examples for Java operators
 *
 * @author Marko
 */
public class Operator {

    // Operators


    public static void main(String[] args) {


        //Unary operators( only one variable )
        //post increment
        int i = 0;
        System.out.println(i);
        //post increment
        System.out.println(i++);  // 0 (increment here but not used, used only when i variable is used next time)
        i++; // i + 1 unary operator (Incremented value plus another value) Increment - juurdekasv
        System.out.println(i);


        //post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);


        //pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        //brackets are the highest priority
        int x = i + (-j); // x = i - j; 2 - 9 ( plus into minus is minus)
        System.out.println(x);

        //binary operator (operator with 2 variables)
        //arithemtic operators
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c); // i can do it (a + b) also

        int d = a + c * b; // * highest priority
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x; // (-j) first because unary
        /*
        1. z = i * a + (c / b) + j % x; minus into minus is plus
        2. z =
         */


        System.out.println(z);


      int divide = 40 / 5; // quotient value ( jagamise vastus ) 40 : 5 = 8
        System.out.println(divide);

        int modulo = 40 % 5; // Reminder value ( ülejääk ) 5 * 8 = 40, 40 - 40 = 0, seega jääk on 0! (% - modulo)
        System.out.println(modulo);
        /*
        30 % 4 = 2 ( 4 * 7 = 28, 30 - 28 = 2) lähim väärtus/ ülejääk
        30 / 4 = 7 ( jagamis tulemus, et saada komakohaga tuleks panna float)
         */


        //Comparison operators(==, !=,
        // always compare variables with same data type
        boolean result = divide == modulo; //8==5 equals
        System.out.println(result);

        boolean result2 = divide != modulo; //8!=5 not equals
        System.out.println(result2);

        boolean lessCheck = divide < modulo;
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo;
        System.out.println(greaterCheck);

        boolean lessEquals = divide <= modulo;
        System.out.println(lessEquals);




        // logical operators (&&, ||) - and, or
        /*
            true && false = false
            false && true = false
            false && false = false
            true && true = true
         */
        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
        true || true = true
        false || false = false
        true || false = true
        false || true = true
        */
        boolean orCheck = (8 < 9) || (10 > 4);
        System.out.println(orCheck);

        //xAnd, XOR
/*
 1 = 00000001;
        2 = 00000010;
        3 = 00000011;
        4 = 00000100;
        5 = 00000101;
        6 = 00000110;
        7 = 00000111;
        8 = 00001000;
        9 = 00001001;
        10 = 00001010;
        11 = 00001011;
        12 = 00001100;
        13 = 00001101;
 */

        // 0 = false
        // 1 = true
        // true ^ false = true
        // false ^ true = true
        // true ^ true = false
        // false ^ false = false

        float expo = 12 ^ 25; // 12 = 0001100, 25 = 00011001
        System.out.println(expo);
        /*
        00001100
        00011001
        --------
        00010101 = 21
         */

        //assignment operators
        x = x + 1; // both are same
        x += 1;
        x /= y;
        x += y;


        //ternary operators 3 variable (?, :)
        String ternary = (8 > 10) ? "Cat" : "Dog";
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lessCheck ? 9 : 10;

        //number comparison
        boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);

        //Mostly used operators in real world
        //++, --
        //+
        //==, !=
        //&&, ||
        //?, :




    }


    }

