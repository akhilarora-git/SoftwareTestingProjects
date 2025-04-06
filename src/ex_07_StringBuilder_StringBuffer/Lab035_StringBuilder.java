package ex_07_StringBuilder_StringBuffer;

public class Lab035_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder is a mutable sequence of characters, similar to StringBuffer.
        // It allows us to modify the contents (e.g., append, insert, delete) without creating new objects.
        // Unlike StringBuffer, StringBuilder is not synchronized, meaning it is not thread-safe.
        // However, because of this, StringBuilder performs faster than StringBuffer in single-threaded environments.
        StringBuilder stringBuilder = new StringBuilder("Arjun");

        // Appending different types of data (here, an integer) to the existing StringBuilder object.
        // The integer 123 is converted to a string and added to the end of the current content.
        stringBuilder.append(123);

        // Output the final string: "Arjun123"
        System.out.println(stringBuilder);
    }
}
