package ex_06_Strings;

public class Lab029_String_Interview {
    public static void main(String[] args) {

        // String literals are stored in the String Constant Pool (SCP)
        String s1 = "Hello";
        String s4 = "Hello"; // Both s1 and s4 refer to the same object in SCP

        // 'new' keyword forces creation of a new object in the heap memory (Outside SCP)
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello"); // Different case, still creates a new object in heap

        // Using '==' compares object references (memory addresses), NOT actual content

        System.out.println("s1 == s3: " + (s1 == s3)); // false -> s1 (SCP) vs s3 (Heap)
        System.out.println("s1 == s2: " + (s1 == s2)); // false -> s1 (SCP) vs s2 (Heap)
        System.out.println("s2 == s3: " + (s2 == s3)); // false -> two different objects in heap

        System.out.println("s1 == s4: " + (s1 == s4)); // true -> both from SCP, same reference
        System.out.println("s3 == s5: " + (s3 == s5)); // false -> different case & different heap objects

        // Using .equals() compares the **content** of the strings
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true -> content is "Hello"
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true -> content is "Hello"
        System.out.println("s3.equals(s5): " + s3.equals(s5)); // false -> case-sensitive: "Hello" vs "hello"

        // equalsIgnoreCase() ignores the case of letters when comparing content
        System.out.println("s3.equalsIgnoreCase(s5): " + s3.equalsIgnoreCase(s5)); // true -> "Hello" vs "hello"

        // Summary:
        // ==          : Compares references (memory addresses)
        // equals()    : Compares content (case-sensitive)
        // equalsIgnoreCase(): Compares content (case-insensitive)
        // =           : Assignment operator
    }
}

