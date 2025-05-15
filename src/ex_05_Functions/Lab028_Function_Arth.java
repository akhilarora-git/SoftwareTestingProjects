package ex_05_Functions;

import java.util.Scanner;

public class Lab028_Function_Arth {
    public static void main(String[] args) {

        // 🎯 GOAL: Create functions for basic arithmetic operations (Sum, Sub, Mul, Div, Mod)
        // 📥 Input: Two integers from user
        // 📤 Output: Result of all 5 operations

        // 📌 Step 1: Take user input using Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num1");
        int a = 0;

        // ✅ Check if user input is an integer before reading it
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
            System.exit(0);  // ❌ Exit the program if input is invalid
        }

        System.out.println("Enter the num2");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
            System.exit(0);
        }

        // 📌 Step 2: Call arithmetic functions and store results
        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);  // ⚠️ Has built-in check for divide-by-zero
        int result_mod = mod(a, b);

        // 📌 Step 3: Print all results
        System.out.println(result_sum);  // Sum
        System.out.println(result_sub);  // Subtraction
        System.out.println(result_mul);  // Multiplication
        System.out.println(result_div);  // Division
        System.out.println(result_mod);  // Modulus (remainder)
    }

    // ✅ Function to add two numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // ✅ Function to subtract b from a
    static int sub(int a, int b) {
        return a - b;
    }

    // ✅ Function to divide a by b, with check for divide by zero
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // ✅ Function to multiply two numbers
    static int mul(int a, int b) {
        return a * b;
    }

    // ✅ Function to get remainder when a is divided by b
    static int mod(int a, int b) {
        return a % b;
    }
}
