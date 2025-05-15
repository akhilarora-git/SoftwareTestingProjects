package ex_17_OOPs_Abstraction_Interfaces;

// MAIN class with main() to run
public class Lab081_Abstraction_Example {
    public static void main(String[] args) {
        // Interface reference holding object of implementing class
        Device myPhone = new SmartPhone();
        myPhone.turnOn();
        myPhone.showInfo();
        Device.showCompany();

        System.out.println();

        // Abstract class reference holding subclass object
        Machine printer = new Printer();
        printer.operate();
        printer.shutdown();
    }
}

// INTERFACE → represents a contract
interface Device {
    void turnOn(); // abstract method

    // default method with body (optional)
    default void showInfo() {
        System.out.println("Generic Device Info");
    }

    // static method in interface
    static void showCompany() {
        System.out.println("Device Company: TechCorp");
    }
}

// CLASS implementing interface
class SmartPhone implements Device {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning ON...");
    }

    // Optionally override default method
    @Override
    public void showInfo() {
        System.out.println("This is a Samsung Galaxy smartphone.");
    }
}

// ABSTRACT CLASS → partial implementation
abstract class Machine {
    abstract void operate(); // must be implemented by subclass

    void shutdown() {  // concrete method
        System.out.println("Machine is shutting down...");
    }
}

// CLASS extending abstract class
class Printer extends Machine {
    @Override
    void operate() {
        System.out.println("Printer is printing documents...");
    }
}