package examples.objects;

/**
 * Default Constructor example
 *
 * @author Marko
 */

public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7"; // 2.moves garbage collection

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Skyline";

        car.name = "Toyota RAV4"; // 1.Java will take the latest one


        //Car car4 = car2, can do like this also
        Car car4 = new Car();
        car4 = car2;

        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc();
    }
}
