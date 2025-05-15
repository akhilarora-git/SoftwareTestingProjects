package ex_19_Static;

public class Lab087_StaticEx3 {
    public static void main(String[] args) {

        // ✅ Step 1: Call static method using class name
        // 🔸 This triggers the class loading process
        // 🔸 As a result, the Static Initialization Block (SIB) executes first — only once per class
        B.commonToAll();  // Executes SIB + prints static method message

        // ✅ Step 2: Access static variable directly using class name
        // 🔸 Static variables are shared and belong to the class, not the object
        System.out.println(B.b);  // Outputs: 10

        System.out.println("-----------");

        // ✅ Step 3: Create an object of class B
        // 🔸 No constructor defined, but default one is invoked
        // 🔸 Object creation allows access to instance (non-static) variables and methods
        B b_ref = new B();

        // ✅ Step 4: Call non-static method using object reference
        // 🔸 Instance methods can access both static and non-static members
        b_ref.display();  // Prints static variable and instance method message

        // ✅ Step 5: Access instance variable using object reference
        // 🔸 Each object gets its own copy of instance variables
        System.out.println(b_ref.a);  // Outputs: 10
    }
}
class B {

    // Static Block: runs only once when the class is loaded (before any object is created)
    static {
        System.out.println("SIB, called once, class is loaded");
    }

    int a = 10;             // Instance variable (non-static)
    static int b = 10;      // Static variable (shared among all objects)

    // Non-static method: can access both static and non-static members
    void display() {
        System.out.println(b);                  // Accessing static variable
        System.out.println("Non static F(n)");  // Method message
    }

    // Static method: belongs to class, can't access non-static members directly
    static void commonToAll() {
        // System.out.println(a); ❌ Not allowed — 'a' is non-static
        System.out.println("Static F(n)");
    }
}
