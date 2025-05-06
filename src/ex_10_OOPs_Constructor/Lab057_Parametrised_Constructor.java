package ex_10_OOPs_Constructor;

/**
 * This class demonstrates the use of parameterized and default constructors in Java.
 */
public class Lab057_Parametrised_Constructor {
    public static void main(String[] args) {

        // Creating an object using the default constructor
        Car2 c2 = new Car2(); // Output: "DC" (from constructor)

        // Creating an object using the parameterized constructor
        Car2 c1 = new Car2("Tesla", "Street", 1999);

        // Printing car names to verify the constructor values
        System.out.println(c1.name); // Output: Street
        System.out.println(c2.name); // Output: Unknown Car!

        // More objects with custom values
        Car2 c4 = new Car2("Mahindra", "Scorpio", 2020);
        System.out.println(c4.name); // Output: Scorpio

        Car2 c5 = new Car2("CURVV", "TATA", 2024);
        System.out.println(c5.model); // Output: CURVV
    }
}

/**
 * Car2 class demonstrates constructor overloading and usage.
 * It has fields for name, model, and year.
 */
class Car2 {

    // Instance variables
    String name;
    String model;
    int year;

    /**
     * Default constructor - sets default values to the fields.
     */
    Car2() {
        model = "XXX";
        year = 1900;
        name = "Unknown Car!";
        System.out.println("DC"); // Indicating that Default Constructor is called
    }

    /**
     * Parameterized constructor - assigns values passed during object creation.
     *
     * @param model_oc_arg Model of the car
     * @param name_oc_arg  Name of the car
     * @param year_oc_arg  Year of manufacture
     */
    Car2(String model_oc_arg, String name_oc_arg, int year_oc_arg) {
        this.name = name_oc_arg;
        this.model = model_oc_arg;
        this.year = year_oc_arg;
    }
}
