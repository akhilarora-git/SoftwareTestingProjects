package ex_16_OOPs_Abstraction_Abstract_Class;

public class Lab075_Abstraction_Cars {
    public static void main(String[] args) {
        // Creating an object of WagonR class and calling the drive method
        WagonR car = new WagonR();
        car.drive();  // Output: "Starting the car!" followed by "Stopping the car!"
    }
}

// Abstract class to represent a general concept of an Engine
abstract class Engine {
    // Abstract methods (no body). Subclasses must override these methods.

    // Represents the action to start the engine
    abstract void startEngine();

    // Represents the action to stop the engine
    abstract void stopEngine();
}

/*
 * WagonR is a specific type of car that has an engine.
 * This class "extends" the abstract class Engine and provides actual working code
 * for the abstract methods: startEngine() and stopEngine().
 */
class WagonR extends Engine {

    // Implementing the abstract method from Engine
    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    // Implementing the abstract method from Engine
    @Override
    void stopEngine() {
        System.out.println("Stopping the car!");
    }

    // Custom method in WagonR class to simulate driving
    void drive() {
        // Driving a car involves starting and then stopping the engine
        startEngine();
        stopEngine();
    }
}
