/**
 *
 * Homework, Operators, Order of Precedence
 *
 * @author Marko
 */



public class Homework {
    public static void main(String[] args) {
        int i = 7;
        int a = 12;
        int b = 1;
        int c = a + (-i);
        int z = i + b * c;


        int r = (a / b) + a * z - (-a) + (+i) % z - (c++) - (c--); // your expression here
        /*
        Order of Precedence
        1.(c++)
        2.(c--) - not used
        3.(-a)
        4.(+i)
        5.(a / b)
        6.a * z
        7.i % z
        8.Then it goes from left to right
        
         */
        System.out.println(r);
    }
}
