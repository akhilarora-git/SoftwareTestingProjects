package ex_22_Exceptions;

public class Lab101_TryCatch_MultipleInputsHandler {
    public static void main(String[] args) {

        // ✅ Check if any input is provided
        if (args.length == 0) {
            System.out.println("❌ No inputs provided! Please enter one or more numbers.");
            return;
        }

        // ✅ Loop through all command-line arguments
        for (int i = 0; i < args.length; i++) {
            String input = args[i];
            System.out.println("\nProcessing input #" + (i + 1) + ": \"" + input + "\"");

            try {
                // Convert to integer (may throw NumberFormatException)
                int number = Integer.parseInt(input);

                // Perform division (may throw ArithmeticException)
                int result = 100 / number;

                System.out.println("✅ Output: 100 / " + number + " = " + result);

            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Not a valid number: \"" + input + "\"");
            } catch (ArithmeticException e) {
                System.out.println("❌ Cannot divide by zero for input: " + input);
            } catch (Exception e) {
                System.out.println("❌ Unexpected error for input \"" + input + "\": " + e.getMessage());
            }
        }

        System.out.println("\n✅ All inputs processed. Program ended gracefully.");
    }
}
