package ex_16_OOPs_Abstraction_Abstract_Class;

public class Lab074_Abstraction {
    public static void main(String[] args) {

        // Creating object of Child class
        Child c = new Child();
        c.loan50K();  // Calls overridden method from Child class
        c.loan25k();  // Calls method from Father class

        // You cannot create an object of an abstract class:
        // Father f1 = new Father(); // ❌ Invalid

        // But you can create a reference of abstract class pointing to a subclass object (Polymorphism)
        Father f2 = new Child();
        // Now using f2, you can call both methods:
        f2.loan50K();  // Calls overridden method in Child
        f2.loan25k();  // Calls inherited concrete method in Father
    }
}

// Abstract class representing the Father
abstract class Father {

    // Abstract method: child classes MUST implement this
    abstract void loan50K();

    // Concrete method: already implemented in the abstract class
    void loan25k() {
        System.out.println("Given 25K");
    }
}

// Child class extends Father and must implement abstract methods
class Child extends Father {

    // Implementing the abstract method from Father
    @Override
    void loan50K() {
        System.out.println("Child will pay the loan!");
    }
}