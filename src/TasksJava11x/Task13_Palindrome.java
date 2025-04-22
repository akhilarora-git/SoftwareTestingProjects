package TasksJava11x;

public class Task13_Palindrome {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows for the pyramid. Change this value as needed.

        // Outer loop to handle the number of rows
        for (int i = 1; i <= rows; i++) {
            // Debug: Print the current row number
            System.out.println("Row: " + i);

            // Inner loop to print spaces
            // Purpose: Push the stars to the center to form a pyramid shape
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Printing space before the stars
            }

            // Inner loop to print stars
            // Number of stars increases with each row following the pattern: 1, 3, 5, ...
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Printing star
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

