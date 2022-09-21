public class OddorEven {
    // Odd or even number
    public static void main(String[] args) {
        int i = 0;

        // solution 1 - if-else
        for(i=0; i<=20; i++) {
            if (i % 2 == 0) { // modulo % because its a multiplier of 2, even(võrdne) number
                System.out.println(i + " is  even number");
            } else {
                System.out.println(i + " is odd number");
            }
        }

        // solution 2 - using ternary operator
            for (i = 0; i <= 20; i++) {               //if else is replaced with ? (if) and : (else)
                System.out.println(i + " is " + (i % 2 == 0 ? "even " : "odd ") + "number"); // i is even/odd number
            }


    }
  }
