/**
 * Statement examples
 *
 * @author Marko
 */

public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Marko"; // if is like a question to check if it's true
        if (name == "Marko" && name != "Piir") {  // here both true so, name is correct
            System.out.println("The name is correct");
        }

        //false            false
        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is simple program"); // ctrl + alt + L will fix the line, ctrl + alt + O will remove

        /*
        if(shirt size == M && shirt color == black) {
        // buy the shirt
        }
         */

        /*
        if(shirt size == M && shirt color == black) {
        // buy the shirt
        } else if (shirt size == M && shirt color == blue)
        // buy the shirt from other shop
        }
         */

        if (i > y) {
            System.out.println("i is greater than y"); //
        } else {
            System.out.println("y is greater than i");

            /*
            if(shirt size == M && shirt color == black) {
            // buy the shirt
            } else {
            // buy the shirt from other shop
             */


            if (i > y) {
                System.out.println("i is gerater than y");
            } else if (i < 9) {
                System.out.println("i is lesser");

            } else {
                System.out.println("i is ivalid");
            }
        }

        /* SWITCH
        If we want to use one condition for multiple values
        */
        int x = 10;
        int j = 6;
        int z = x + j; // 11


        switch (z) {
            case 10:
                System.out.println("Value of z is 10");
            case 11:
                System.out.println("the value of z is 11");
                break; // break and default are optional
            case 12:
                System.out.println("the value of z is 12");
            default:
                System.out.println("Default block executed");
        }

        String color = "Red";

        switch (color) {
            case "Red":
                System.out.println("I am Red");
                //case 1: Error because not same data type
            case "white":
                System.out.println("I'm White");
                break;
        }


        // WHILE (Entry-check loop)to make it like a loop
        int money = 0;

        while (money <= 5) {
            System.out.println("Doing job. Money = " + money);
            money++; // money = money + 1 increments post - increment
        }

        // Do - WHILE (exit-check loop)

        do {
            System.out.println("money =" +money);
            money += 10; // money = money + 10
        } while(money < 100);

        //FOR if you everything in single line like a loop again

        for (int g = 0; g <= 6; g++) {
            System.out.println(" g value is: " + g);
        }
    }
}



