package ex_16_OOPs_Abstraction_Abstract_Class;

// This is the main class, though it currently has no logic
public class Lab076_Abstraction_Realtime {

}

// Abstract class: cannot be instantiated directly, meant to be extended
abstract class Employee {

    private String name;
    private String address;
    private int number;

    // Default constructor
    Employee() {
        System.out.println("DC"); // Prints "DC" when default constructor is used
    }

    // Parameterized constructor
    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee"); // Indicates object creation
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Abstract method - no body, must be implemented by child class
    abstract double computePay();

    // Concrete method - shared functionality for all child classes
    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
}

// Concrete subclass of Employee
class C1 extends Employee {

    // Must implement the abstract method computePay()
    @Override
    double computePay() {
        return 0; // For now, just returns 0
    }
}
