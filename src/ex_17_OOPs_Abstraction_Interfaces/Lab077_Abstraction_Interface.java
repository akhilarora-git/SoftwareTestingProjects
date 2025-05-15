package ex_17_OOPs_Abstraction_Interfaces;

// Main class containing the main method
public class Lab077_Abstraction_Interface {

    public static void main(String[] args) {
        // Creating an object of Car1 class
        Car1 c1 = new Car1();
        // Calling the drive method on the Car1 object
        c1.drive();
    }

}

// Car1 class implements two interfaces: Engine1 and Brakes
class Car1 implements Engine1, Brakes {

    // Custom method to simulate driving behavior
    void drive() {
        // Start the engine
        startEngine();
        // Apply brakes
        applyBreak();
        // Stop the engine
        stopEngine();
    }

    // Overriding method from Brakes interface
    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    // Overriding method from Engine1 interface
    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    // Overriding method from Engine1 interface
    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}

// Brakes interface with one abstract method
interface Brakes {
    void applyBreak();  // No body, must be implemented by the class
}

// Engine1 interface with two abstract methods and one default method
interface Engine1 {
    void startEngine();  // Abstract method
    void stopEngine();   // Abstract method

    // A default method with a concrete implementation (Java 8+ feature)
    default void test() {
        System.out.println("concrete complete");
    }
}
