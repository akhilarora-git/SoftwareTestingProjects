package ex_10_OOPs_Constructor;

/**
 * Main class to test different constructors of the Person class.
 * Demonstrates constructor overloading, object initialization, and method calling.
 */
public class Lab058_Parametrised_Constructor2 {
    public static void main(String[] args) {

        // Creating object using default constructor
        Person defaultPerson = new Person();
        System.out.println("Default Address: " + defaultPerson.address); // Will print 'null'

        // Creating object using parameterized constructor (name, phone, address)
        Person p1 = new Person("Arjun", 98585946L, "Winnipeg, Str-14");
        System.out.println("P1 Address: " + p1.address);

        // Creating another object using the same parameterized constructor
        Person p2 = new Person("Pramod", 98989898L, "XYZ");
        System.out.println("P2 Phone: " + p2.phone);

        // Again using default constructor
        Person p3 = new Person();
        System.out.println("P3 Address (default): " + p3.address);

        // Manually assigning values to fields (not recommended; for demonstration only)
        p3.name = "Shikha";  // Should ideally be set through constructor
        System.out.println("P3 Name (manually set): " + p3.name);

        // Using overloaded constructor with only name and phone
        Person p4 = new Person("Lucky", 823424242L);
        System.out.println("P4 Name: " + p4.name);

        // Calling instance method 'eat' for all objects
        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
/**
 * Represents a Person with name, phone number, and address.
 * Demonstrates constructor overloading.
 */
class Person {

    // Instance variables
    String name;
    long phone;
    String address;

    /**
     * Default constructor
     * Initializes nothing. Useful if fields are set later or for frameworks that require a no-arg constructor.
     */
    Person() {
        // No initialization — fields will have default values (null or 0)
    }

    /**
     * Parameterized constructor with name, phone, and address.
     */
    Person(String name_arg, long phone_arg, String address_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }

    /**
     * Overloaded constructor with name and phone only.
     * Address can be set later or will remain null.
     */
    Person(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
    }

    /**
     * Method representing a behavior of the person.
     * Prints a message including the person's name.
     */
    void eat() {
        System.out.println(this.name + " is eating!");
    }
}
