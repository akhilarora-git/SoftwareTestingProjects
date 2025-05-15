package ex_22_Exceptions;

import java.util.Scanner;

public class Lab102_ExceptionHandler_RealTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📥 Enter your age (must be a number): ");

        try {
            String input = sc.nextLine(); // Taking user input

            // ✅ Convert to integer (can throw NumberFormatException)
            int age = Integer.parseInt(input);

            // ✅ Divide by age (can throw ArithmeticException if age = 0)
            int divisionResult = 100 / age;

            System.out.println("✅ Success! Age accepted. Division Result: " + divisionResult);

        } catch (NumberFormatException e) {
            System.out.println("❌ Please enter a valid numeric age.");
        } catch (ArithmeticException e) {
            System.out.println("❌ Age cannot be 0. Division by zero not allowed.");
        } catch (Exception e) {
            System.out.println("❌ Unknown error occurred: " + e.getMessage());
        } finally {
            // ✅ This will always run, even if an exception occurs
            System.out.println("🔒 Cleaning up... closing scanner and releasing resources.");
            sc.close();
        }

        System.out.println("✅ Program finished smoothly.");
    }

}