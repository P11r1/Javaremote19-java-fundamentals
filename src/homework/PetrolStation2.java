package homework;

import java.util.Random;
import java.util.Scanner;

public class PetrolStation2 {
    private static final double PETROL_PRICE_PER_LITRE = 1.998; //Petrol price
    private static final double THRESHOLD_AMOUNT = 5; // Litres
    private static final String CURRENCY = "EUR"; // Currency
    static double totalQuantity = 0;
    static double totalAmount = 0;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETROL STATION");
        System.out.println("=========================");
        System.out.println("Today's petrol price: " + PETROL_PRICE_PER_LITRE + CURRENCY); // Todays petrol price

        System.out.println("Do you want to refill the tank?");

       //Loop for refilling and totalAmount and totalQuantity
        while (isContinue()) {
            totalQuantity += THRESHOLD_AMOUNT;
            totalAmount = totalQuantity * PETROL_PRICE_PER_LITRE;

            //Displays cart(totalAmount, totalQuantity)
            displayCart();
            System.out.println("Do you want to fill more?");
        }

        //Displays cart(totalAmount, totalQuantity)
        System.out.println("Thanks for visiting!");
        displayCart();

        //Payment
        if (totalAmount > 0) {
            System.out.println("Do you wish to pay now? (True/False)");

            if (isContinue()) {
                boolean isMoneyPayed = false;


                while (!isMoneyPayed) {
                    double money = getMoney();
                    System.out.println("Money paid: " + money + CURRENCY);
                    String message = "Thanks for the payment! Visit us again!";

                    if (money == totalAmount) { // User paid exactly as much as required
                        System.out.println(message);
                        isMoneyPayed = true;
                    } else if (money > totalAmount) { // The user paid too much
                        double balance = money - totalAmount;
                        System.out.println("Balance return: " + balance + CURRENCY);
                        System.out.println(message);
                        isMoneyPayed = true;
                    } else { // User paid too little
                        System.out.println("The amount paid is lesser than the total amount! Please pay the correct amount!");
                    }
                }
            } else {
                System.out.println("Invoice will be sent to you! Thank you!");
            }
        }
    }

    private static boolean isContinue() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer. Please enter again:";
        boolean checker = false;
        boolean answer = false;


        do {
            if (!scanner.hasNextBoolean()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                answer = scanner.nextBoolean();
                checker = true;
            }

        } while (!checker);

        return answer;
    }

    //Here will be displayed the totalAmount and totalQuantity
    private static void displayCart() {
        System.out.println("Total fuel refilled: " + totalQuantity + " litres");
        System.out.println("Total amount " + totalAmount + CURRENCY);
    }

    //Here we get random money for the user
    private static int getMoney() {
        return new Random().nextInt(2000 - 1) + 1;
    }
}
