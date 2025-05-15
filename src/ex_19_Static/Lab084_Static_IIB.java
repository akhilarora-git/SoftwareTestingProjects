package ex_19_Static;

public class Lab084_Static_IIB {
    public static void main(String[] args) {

        // Creating 3 objects of class P
        P p1 = new P();  // SIB runs once before this (when class is loaded), IIB & Constructor run now
        P p2 = new P();  // Only IIB + Constructor run
        P p3 = new P();  // Only IIB + Constructor run

        // Output behavior:
        // - Static block runs only ONCE, when the class is loaded.
        // - Instance block (IIB) runs EVERY time an object is created.
    }
}

class P {

    // Instance Initialization Block (IIB)
    // This block runs every time an object is created, before the constructor
    {
        System.out.println("IIB");
    }

    // Constructor
    // Called after the IIB
    P() {
        System.out.println("DC");
    }

    // Static Initialization Block (SIB)
    // Runs ONLY ONCE when the class is loaded (before any object is created)
    static {
        System.out.println("SIB");
    }
}
