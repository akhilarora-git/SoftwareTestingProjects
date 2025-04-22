package TasksJava11x;

public class Task15_Person_Class_with_DC_PC {
    public static void main(String[] args) {

        // Creating object using Default Constructor
        Person2 person1 = new Person2();
        person1.printDetails();

        // Creating object using Parameterized Constructor (All values)
        Person2 person2 = new Person2("Akhil", 29, "Haryana", "888887474", true);
        person2.printDetails();

        // Creating object using Parameterized Constructor (Partial values)
        Person2 person3 = new Person2("Deepak", 32, false);
        person3.printDetails();
    }
}

class Person2 {
    // Variables (properties)
    String name;
    int age;
    String address;
    String phone_no;
    boolean isMale;

    // 👉 Default Constructor (No parameters)
    Person2() {
        name = "Arjun";
        age = 25;
        address = "Delhi";
        phone_no = "1234567890";
        isMale = true;
    }

    // 👉 Parameterized Constructor - Full details
    Person2(String name, int age, String address, String phone_no, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_no = phone_no;
        this.isMale = isMale;
    }

    // 👉 Parameterized Constructor - Only name, age, gender
    Person2(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;

        // Optional default values for other fields
        this.address = "Not Provided";
        this.phone_no = "Not Provided";
    }

    // Method to print person details
    void printDetails() {
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Address  : " + address);
        System.out.println("Phone No : " + phone_no);
        System.out.println("Is Male  : " + isMale);
        System.out.println("---------------------------------------------");
    }
}
