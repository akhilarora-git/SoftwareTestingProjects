package ex_15_OOPs_Super;

// Main class that contains the main method
public class Lab072_Super_Keyword_1 {
    public static void main(String[] args) {
        // Creating a Car object using the parameterized constructor
        Car c1 = new Car(100);
        // Calling the display() method from Car class
        c1.display();
    }
}

// Parent class - Vehicle
class Vehicle {
    // Instance variable
    public int maxSpeed = 200;

    // Default constructor
    Vehicle() {
        System.out.println("Default Const");
    }

    // Parameterized constructor
    Vehicle(int a) {
        System.out.println("Param Con");
    }

    // Overloaded methods (method overloading: same name, different parameters)
    void message() {
        System.out.println("No Return, No Argument");
    }

    void message(int a) {
        System.out.println("PC - argument");
    }

    // Method that can be overridden
    void display() {
        System.out.println("Vehicle Parent");
    }
}

// Child class - Car extends Vehicle
class Car extends Vehicle {

    // Child class variable with same name as parent's
    private int maxSpeed = 281;

    // Getter and Setter for maxSpeed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Default constructor explicitly calling super()
    Car() {
        super(); // Calls Vehicle() default constructor
    }

    // Parameterized constructor calling parent's parameterized constructor
    Car(int a) {
        super(10); // Calls Vehicle(int a)
    }

    // Overriding the display method from Vehicle class
    @Override
    void display() {
        // Accessing current class variable
        System.out.println(this.maxSpeed); // Output: 281 (Car's maxSpeed)

        // Accessing parent class variable using super
        System.out.println(super.maxSpeed); // Output: 200 (Vehicle's maxSpeed)

        // Calling parent class methods using super
        super.message();      // Output: "No Return, No Argument"
        super.message(10);    // Output: "PC - argument"

        // Calling parent class version of display()
        super.display();      // Output: "Vehicle Parent"

        // This statement belongs to the overridden method in Car
        System.out.println("Override");
    }
}
