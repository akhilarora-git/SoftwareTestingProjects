package ex_19_Static;

public class Lab085_Static2 {
    public static void main(String[] args) {

        // First object of class A
        A ref1 = new A(10);
        ref1.displayValue();        // shows value of 'a' for ref1 (10)
        System.out.println("Static b (via class): " + A.b);

        // Change static variable 'b' (shared for all objects)
        A.b = 45;

        System.out.println("------");

        // Second object of class A
        A ref2 = new A(20);
        ref2.displayValue();        // shows value of 'a' for ref2 (20)
        System.out.println("Static b (via class): " + A.b); // still 45

        System.out.println("------");

        // Third object of class A
        A ref3 = new A(30);
        ref3.displayValue();        // shows value of 'a' for ref3 (30)
        System.out.println("Static b (via class): " + A.b); // still 45
    }
}

class A {

    int a;              // Non-static: unique for every object
    static int b = 20;  // Static: shared by all objects of class A

    // Constructor to initialize non-static variable 'a'
    A(int a) {
        this.a = a;
    }

    // Method to display non-static variable 'a'
    void displayValue() {
        System.out.println("Instance variable a: " + this.a);
    }
}