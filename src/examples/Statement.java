package examples;

/**
 * Statement examples
 *
 * @author Marko
 */

public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Marko"; // if is like a question to check if it's true, should return boolean value
        // if is used to execute a block of code. always use curly braces
        if (name == "Marko" && name != "Piir") {  // here both true so, name is correct.
            System.out.println("The name is correct");
        }

        //false            false
        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is simple program"); // ctrl + alt + L will fix the lining, ctrl + alt + O will remove unnessecary input statements

        /*
        if I go to shop and find shirt size is medium and color is black then I buy the shirt
        if(shirt size == M && shirt color == black) {
        // buy the shirt
        }
         */

        /*
        if I go to the shop I and shirt size IS(==) Medium(M) AND(&&) color IS(==) black I buy, OTHERWISE(ELSE) I go another shop
        if(shirt size == M && shirt color == black) {
        // buy the shirt
        } else {
        // buy the shirt from other shop
        }
        */

        // if its true then shop has shirt, if false then go another shop
        if (i > y) {
            System.out.println("i is greater than y"); // I buy the shirt (basically true and false block)
        } else {
            System.out.println("y is greater than i"); // I go to another shop
        }

            /*
            if(shirt size == M && shirt color == black) {  // i go to the shop and look for M and black, if its there
            i buy the shirt, if not i change my mind and look for blue shirt, if its there i buy the shirt, if not
            i go to another shop
            // buy the shirt
            } else if(shirt size == M && shirt color == blue) {
            // buy the shirt
            } else {
            // buy the shirt from other shop
            }
             */


        if (i > y) {
            System.out.println("i is greater than y"); // i have here multiple conditions
        } else if (i < 9) {
            System.out.println("i is lesser"); // if i have else if block the else block under is optional
        } else {
            System.out.println("i is invalid");
        }


    /* SWITCH
    If we want to use one condition for multiple values
    */
        int x = 5;
        int j = 7;
        int z = x + j; // 12

        // it checks if the value of z is 10, then execudes the block, if not it will jump to another block till it finds the correct value for z
        switch (z) {
            case 10:
                System.out.println("Value of z is 10"); // checks if case 10 has correct value. its not so goes to next block
            case 11:
                System.out.println("the value of z is 11"); // checks if case 11 has correct value, no so goes to next block
                break; // break and default are optional
            case 12:
                System.out.println("the value of z is 12"); // checks if case 12 has correct value for z, yes so executes the block
            default:
                System.out.println("Default block executed"); // executes the block also cause no break between case 12 and default
        }
        // Have to be from same data type, i cant put int and the letter "a"
        String color = "Red";

        switch (color) { // called as switch-case
            //case 1: Error because not same data type
            case "Red":
                System.out.println("I am Red");

            case "white":
                System.out.println("I'm White");
                break;
        }


        // WHILE (Entry-check loop)to make it like a loop
        int money = 0;
        // in while it checks first (money<=5) and then executes block
        while (money <= 5) { // i go to job, get money, yhen it will go back, check how much i have, then again do job, get money, until its 5
            System.out.println("Doing job. Money = " + money);
            money++; // money = money + 1 increments, post - increment
        } // output will be 6 times, because 0 is also incremented


        // Do - WHILE (exit-check loop)
        //first executes the block and then checks( while (money < 100))

        do {
            System.out.println("money =" + money); // i can put "money" string directly inside the brackets the, "money =" (string value) + money(variable)
            money += 10; // money = money + 10
        } while (money < 100); // in this example, until it reaches false it keeps repeating

        //FOR if you want to do everything in single line, like a loop again

        for (int g = 0; g <= 6; g++) {
            System.out.println(" g value is: " + g);
        } /*
         step 1. g = 0
         step 2. g <= 6
         step 3. sout
         step 4. g++, increments
         */
    }
}



