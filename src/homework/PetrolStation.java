package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Petrol Station
 * Simulate the process of refueling. Within the while loop ask user if you should continue or finish.
 * For every entered “continue” command you should add a specific amount of petrol and money (both of type double) and view it on the console.
 * At the end user should pay for petrol. Consider multiple possibilities, like:
 * The user paid exactly as much as required.
 * The user paid too much (cashier should return the rest of the money).
 * The user paid too little – should be asked for the rest.
 *
 * @author Marko
 */
public class PetrolStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double petrol = 1;
        double price = 1.89;


        System.out.println("PETROL STATION \n--------------");
        System.out.println("Refilling");

        System.out.println("Do you want to refill the tank?");
        boolean isContinue = scanner.nextBoolean();

        double totalAmount = 0;
        int totalLitres = 0;


        while (isContinue) {

            totalLitres += petrol;
            totalAmount = totalLitres * price;

            System.out.println("TotalLitres: " + totalLitres + "L");
            System.out.println("Total amount: " + totalAmount + " Eur");

            System.out.println("Do you want to continue?");
            isContinue = scanner.nextBoolean();
        }

        //Payment
        if (totalAmount > 0) {
            System.out.println("Do you wish to pay now? (True/False)");
            System.out.println("TotalLitres: " + totalLitres + "L");
            System.out.println("Total amount: " + totalAmount + " Eur");

            if (isContinue()) {
                boolean isMoneyPayed = false;

                while (!isMoneyPayed) {
                    double money = getMoney();
                    System.out.println("Money paid: " + money + "Eur");
                    String message = "Thanks for the payment! Visit us again!";

                    if (money == totalAmount) { // User paid exactly as much as required
                        System.out.println(message);
                        isMoneyPayed = true;
                    } else if (money > totalAmount) { // The user paid too much
                        double balance = money - totalAmount;
                        System.out.println("Balance return: " + balance + "Eur");
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
    //Random amount of money
    private static int getMoney() {
        return new Random().nextInt(2000 - 1) + 1;
    }
}


