package examples;

/**
 * String Examples
 *
 * @author Marko
 */
public class StringExample {

    public static void main(String[] args) {
        String firstName = "Marko ";
        String lastName = "Piir";
        String fullName = firstName + lastName; // option 1

        System.out.println(fullName);

        firstName.concat(lastName); // option 2, concat means joining two Strings together

        String city = "Parnu";

        String ageString = "My ages is : " + 3 + ". I ive in " + city + ". My name is: " + fullName; // this whole line is a String
        System.out.println(ageString);
                                                               // d% integer %s string
        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 3, city, fullName);
        System.out.println(ageStringFormatted);


        //StringBuilder
        // automatically joins to the same variable
        StringBuilder str1 = new StringBuilder("Hello ");
        str1.append("World");

        StringBuilder str2 = str1.append("World"); // append instead of concat
        System.out.println(str2);


        // need to assign to the variable additionally
        String var1 = "Red";
        var1.concat("Yellow");


        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);

        // Equality
        // ==     -> compare memory reference and the value
        // string.equals()   -> compare only the value

        String s1 = "Sibul"; // Pool
        String s2 = "Sibul"; // Pool
        String s3 = new String("Sibul"); // Heap (1)//589498465 random memory value
        String s4 = new String("Sibul"); // Heap (1)//564864651

        System.out.println(s1 == s3); // False because stored in different memory
        System.out.println(s1 == s2);
        System.out.println(s3 == s4); // (1)false because the memory values where string value is stored are different

        System.out.println(s1.equals(s3)); // True because .equals compares only values


    }
}






    /*  the power of 8
                          62
        (6 * 8 pow 1)    +      (2 * 8 pow 0) = 48 + 2 = 50

                3 * 8 pow 1 + 6 * 8 pow 0

                           2874
 (2 * 8 pow 3) + (8 * 8 pow 2) + (7 * 8 pow 1) + (4 * 8 pow 0)
        (2 * 512) + (8 * 64) + (7 * 8) + (4 * 1)
                 1024 + 512 + 56 + 4
*/