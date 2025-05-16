package ex_22_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab105_Throws {
    public static void main(String[] args) throws Exception {
        System.out.println("📂 Program Started");
        try {
            // ✅ File handling - Throws FileNotFoundException (checked exception)
            readfile();
            // ✅ NullPointerException demo and handling
            String s1 = null;
            if (s1 != null) {
                s1.trim();
            } else {
                System.out.println("⚠️ Warning: String is null, can't trim.");
            }
            // ✅ ArithmeticException demo and handling
            int a = 10;
            int b = 0;
            if (b != 0) {
                int result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("⚠️ Division by zero is not allowed.");
            }// ✅ Creating a new File instance (example)
            File file = new File("C://demo.txt");
            if (file.exists()) {
                System.out.println("📁 File exists: " + file.getAbsolutePath());
            } else {
                System.out.println("📁 File does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ General exception: " + e.getMessage());
        } finally {
            // ✅ Finally block always executes (used for resource cleanup)
            System.out.println("🔚 Program Ended - Resources released.");
        }
    }
        static void readfile()throws FileNotFoundException{
            FileInputStream fileInputStream = new FileInputStream("C://a.log"); // File must exist
            System.out.println("📘 FileInputStream object created.");
            // In real automation, you'd read content from the file here
        }

}

