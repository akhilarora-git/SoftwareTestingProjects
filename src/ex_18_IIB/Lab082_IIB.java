package ex_18_IIB;

public class Lab082_IIB {

// Instance initialization Block == IIB
// I will be executed when Object is created.

    public static void main(String[] args) {
        // Creating an object of class A
        // This triggers the IIB blocks first, then the constructor
        A a = new A();
    }
}

// Class A contains IIB blocks and a constructor
class A {

    // Constructor of class A
    // This is called AFTER all instance blocks (IIBs) are executed
    A() {
        System.out.println("DC"); // DC stands for Default Constructor
    }

    // First IIB block
    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");

        // Examples of what can be done in IIB:
        // -> mysql connection
        // -> read a csv, xlsx file
        // -> read json, xml.
        // -> read a text file or env file
    }

    // Second IIB block
    {
        System.out.println("Hi, I am IIB 2");
    }

    // Third IIB block, we can make multiple IIBS
    {
        System.out.println("Hi, I am IIB 3");
    }
}
