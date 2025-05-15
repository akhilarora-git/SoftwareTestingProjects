package ex_22_Exceptions;

public class Lab099_TryCatch_WithOr {
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.trim();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("First error: " + e.getMessage());
        }
// separated this because - Only the first exception that occurs is caught and handled.
// Once an exception is thrown, the remaining code in the try block is skipped.
        try {
            int a = 10 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Second error: " + e.getMessage());
        }
    }
}