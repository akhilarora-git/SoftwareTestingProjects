package ex_05_Functions;

public class Lab027_UDI_Part1 {
    public static void main(String[] args) {

        // 1. Calling a function that prints a message (void, no return, no parameters)
        wp_wr_greet();

        // 2. Calling a function that returns a String (no input, return type is String)
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);  // Printing the returned message

        // 3. Calling a function with multiple parameters (String, int, double)
        greet_with_details("arjun", 28, 100000.51);

        // 4. Calling a function with two String parameters to print full name
        greet_with_full_name("arjun", " arora");

        // 5. Calling a function that adds two numbers (with return value), but not storing/printing result
        sum_of_two(52,48);  // Note: return value is not being used here
    }

    // 1. Simple void function with no parameters (wp = without parameters, wr = without return)
    static void wp_wr_greet() {
        System.out.println("Hi, How are you?");
    }

    // 2. Function with no parameters but returns a String (wp = without parameters, RT = return type present)
    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return "Hi, are you?";
    }

    // 3. Function with parameters and no return (used to print user details)
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name +
                "\nYour age is " + age +
                "\nYour salary is " + salary);
    }

    // 4. Function to print full name using two string inputs
    static void greet_with_full_name(String firstname, String lastname){
        System.out.println("Hi, Your name is " + firstname + lastname);
    }

    // 5. Function that returns the sum of two integers (with return type but return is not used in main)
    static int sum_of_two(int a, int b){
        return a + b;  // Returning the sum of a and b
    }
}
