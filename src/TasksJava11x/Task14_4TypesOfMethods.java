package TasksJava11x;

public class Task14_4TypesOfMethods {

    // Create a simple Person class inside the same file
    static class Person {

        // 5 basic variables
        String name;
        int age;
        String city;
        String phone;
        boolean isStudent;

        // 1. Without Parameters and Without Return Type
        public void sayHello() {
            System.out.println("Hello! I am learning Java.");
        }

        // 2. Without Parameters but With Return Type
        public int getAge() {
            return age;
        }

        // 3. With Parameters and Without Return Type
        public void setName(String newName) {
            name = newName;
            System.out.println("Name has been set to: " + name);
        }

        // 4. With Parameters and With Return Type
        public int calculateBirthYear(int currentYear) {
            return currentYear - age;
        }
    }

    public static void main(String[] args) {
        // Create object of Person
        Person p = new Person();

        // Set initial value
        p.age = 25;

        // Call all types of methods
        p.sayHello(); // 1. No input, no output
        System.out.println("Age is: " + p.getAge()); // 2. No input, with output
        p.setName("Alice"); // 3. With input, no output
        System.out.println("Birth year is: " + p.calculateBirthYear(2025)); // 4. With input, with output
    }
}
