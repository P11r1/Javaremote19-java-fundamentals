package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Create two arrays:
 * gasolineCars
 * electricCars
 *
 * Join the array
 *
 * Result: allCars
 *
 * @author Marko
 */
public class ConcatArrays {
    public static void main(String[] args) {
        String[] gasolineCars = {"Audi A7", "Subaru Legacy", "Dodge RAM"};
        String[] electricCars = {"Tesla model 3", "Nissan Leaf", "VW UP", "Ford Mustang"};
        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);


        String[] allCars2 = new String[gasolineCars.length + electricCars.length];

        for (int i = 0; i < gasolineCars.length; i++) {
            allCars2[i] = gasolineCars[i];
        }

        for (int i = 0; i < electricCars.length; i++) {
            allCars2[i + gasolineCars.length] = electricCars[i];
        }
        System.out.println(allCars);
        System.out.println(Arrays.toString(allCars2));
    }
}
