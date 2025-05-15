package ex_22_Exceptions;

public class Lab100_TryCatch_MultipleOr {
    public static void main(String[] args) {
        try {
            // ✅ Step 1: Reading input from command-line argument
            // If no argument is passed, ArrayIndexOutOfBoundsException will be thrown
            String input_user = args[0];

            // ✅ Step 2: Converting input to integer
            // If input is not a number (like "abc"), NumberFormatException will be thrown
            int a = Integer.parseInt(input_user);

            // ✅ Step 3: Performing division
            // If input is 0, ArithmeticException will be thrown (division by zero)
            int output = 100 / a;

            System.out.println("Output = " + output); // Only prints if no exception occurs

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ No input provided! Please pass a number as an argument.");
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid number format! Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("❌ Cannot divide by zero!");
        } catch (Exception e) {
            // ✅ Catch any other unexpected exception
            System.out.println("❌ Something went wrong: " + e.getMessage());
        }

        // ✅ Always runs regardless of exception
        System.out.println("✅ Program ended gracefully.");
    }
}
