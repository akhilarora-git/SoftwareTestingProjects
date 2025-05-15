package ex_19_Static;

public class Lab086_StaticWithMethods {
public static void main(String[] args) {

    // Creating two objects of class A
    A1 obj1 = new A1(100);
    A1 obj2 = new A1(200);

    // Calling instance method (requires object)
    obj1.show();  // prints a = 100, b = 20
    obj2.show();  // prints a = 200, b = 20

    System.out.println("-----");

    // Updating static variable b via class
    A1.b = 99;

    // Static method call (using class name — recommended)
    A1.showStatic();  // prints value of static b

    System.out.println("-----");

    // Showing that static variable 'b' is shared
    obj1.show();  // a = 100, b = 99
    obj2.show();  // a = 200, b = 99
}
}

class A1 {

    int a;                 // Instance variable (unique to each object)
    static int b = 20;     // Static variable (shared by all objects)

    A1(int a) {
        this.a = a;        // Set instance variable
    }

    // Instance method: can access both static and non-static variables
    void show() {
        System.out.println("Instance a: " + a);
        System.out.println("Static b: " + b);
    }

    // Static method: can access ONLY static variables directly
    static void showStatic() {
        // System.out.println("Instance a: " + a); ❌ Not allowed - 'a' is non-static
        System.out.println("Static b (inside static method): " + b);
    }
}
