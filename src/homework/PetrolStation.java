package homework;

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


        System.out.println("PETROL STATION \n---------------");
        System.out.println("Refilling");

        System.out.println("Do you want to continue refilling?");
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

        System.out.println("Do you want to pay?");
        isContinue = scanner.nextBoolean();

        while (isContinue) {
            if (scanner.nextBoolean()) {
                System.out.println("Amount to be paid: " + totalAmount);
            } else {
                System.out.println("Invalid option. Please enter again!");
            }
        }

    }
}


