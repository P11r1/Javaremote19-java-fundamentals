/**
 * Examples of primitive data types
 *
 * @author Marko
 */

public class Datatype {
    // Primitive Data types always small letter
    // Numbers
    int a = 1;
    byte byteNumber = 120;
    long longNumber = 56213565878L;
    short shortNumber = -32000;

    // for decimals
    float decimalNumber = 2.45f;
    double doubleDecimalNumber = 3.456d;

    // character for letters always single quotes
    char alpha = 'F';

    // True/False always question
    boolean hadLunch = true; //had lunch?
    boolean isHoliday = false;

    /* Multi-line
    comment
     */

    // default values, if i dont assign the value it's declaration, if i do it's initialization
    int i; // 0
    float x; // 0.00f
    char animal; // ''
    boolean isClassTomorrow; // false


    // Non-primitive data types capital letter
    String word = "I'm a developer"; // Strind for words, always double quotes
    Character random = 'u';
    Integer number = 5;
    Float numberSecond = 2.45F;
    Integer randomNumber;   // default null - means it doesn't have any value. It's for all non-primitive data types!

    // Multi-Declaration
    int numberOne, numberTwo, numberThree; // use comma when want do declare multiple variables

    String fruit = "apple", vegetable = "pumpkin", cities; // use comma


    // Scope of class variables
    private static String CAR = "Toyota"; // private means i can only access from this class(when static then capital letter to variable)

    public static String FOOD = "Cake"; // public - can acess from other classe(when static then capital letter to variable)

    // all the above are instance variables because they are outside of method (method example psvm)

    public static void main(String[] args) { // unchangeable value static
        int k = 0; // asks for Initialize because data type value not assigned maybe because IntelliJ
        Integer y = null;


        System.out.println(k);
        System.out.println(y);



        String _color = "black"; // variable can also start with _ underscore, $ dollar
        int $hexaNumber = 0x2A;

        float exam12_mark =100.10f; // variable can't start with number, but can be in the middle of variable

        String className = "sda"; // can't be just class because it's keyword

        int a = 100;                       // inside a block is local variable
        int b = 0;
        int c = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);

    }




}
