package ex_21_Wrapper_Class;

// Demonstrates: Wrapper Classes, Inheritance, Method Overloading, Static Members, and Interfaces
public class Lab094_Wrapper_Recollection {

    public static void main(String[] args) {

        // ✅ Creating objects of Mobile with wrapper types
        Mobile iphone = new Mobile(1, "iPhone 16", 120000.00);
        Mobile samsung = new Mobile(2, "Ultra 24", 135000.00);

        // ✅ Changing price using setter method (Double is wrapper for double)
        iphone.setPrice(200000.89); // Demonstrates Wrapper class usage

        // ✅ Displaying mobile details
        iphone.display();  // Uses custom display() method
        samsung.display();

        // ✅ Accessing static variable (shared across all objects)
        System.out.println(Mobile.mobile_carrier); // Output: airtel

        // ✅ Calling static method (belongs to class, not object)
        Mobile.switchOnAirplaneMode(); // Output: Common Airplane Mode
    }
}

// ✅ Child class extending OldPhone and implementing extra features
class Mobile extends OldPhone {

    // Using wrapper classes instead of primitives for OOP flexibility (null-safe, collection-friendly)
    private Integer phone;   // Wrapper for int
    private String name;
    private Double price;    // Wrapper for double

    // Static variable (shared among all instances of Mobile)
    static String mobile_carrier = "airtel";

    // Default Constructor
    Mobile() {
        System.out.println("DC"); // Just prints when this constructor is used
    }

    // Parameterized Constructor
    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    // ✅ Custom method to display Mobile object data
    void display() {
        System.out.println("Model: " + this.name +
                ", ID: " + this.phone +
                ", Price: ₹" + this.price);
    }

    // ✅ Getters and Setters (important in frameworks like Selenium/POJO for encapsulation)
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // ✅ Static Method (can be used without creating object)
    static void switchOnAirplaneMode() {
        System.out.println("Common Airplane Mode");
    }

    // ✅ Method Overloading with Wrapper Classes
    void priceChange(Integer price) {
        System.out.println("Change price using Integer (whole number): " + price);
    }

    void priceChange(Double price) {
        System.out.println("Change price using Double (decimal): " + price);
    }

    // ✅ Overriding calling() from OldPhone
    @Override
    void calling() {
        System.out.println("dialpad -> Touch dialpad now!!");
    }
}

// ✅ Parent Class with basic phone behavior
class OldPhone implements SIMCard {

    // Method to be overridden
    void calling() {
        System.out.println("dialpad");
    }

    // ✅ Method from interface
    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}

// ✅ Interface to be implemented by OldPhone
interface SIMCard {
    void enterCard();
}

