package examples.objects;

/**
 * Object examples
 *
 * @author Marko
 */

public class ObjectExample { //constructor
    public String name; // private - cant access from other classes

    // Non-parameterized constructor or normal
    public ObjectExample() {
        System.out.println("Constructing Object Example..");
        name = "Marko";



    }

    // Parameterized Constructor
    public ObjectExample(int age, String name) {
        System.out.println(age);
        System.out.println(name);

    }

}
