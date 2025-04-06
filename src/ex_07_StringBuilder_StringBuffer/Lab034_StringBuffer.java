package ex_07_StringBuilder_StringBuffer;

public class Lab034_StringBuffer {
    public static void main(String[] args) {
        // StringBuffer is a mutable sequence of characters, just like StringBuilder.
        // The key difference is that StringBuffer is synchronized, which means it is thread-safe.
        // It is suitable for multi-threaded environments where multiple threads might access the same object.
        // However, due to synchronization, it is generally slower than StringBuilder in single-threaded scenarios.
        StringBuffer stringBuffer = new StringBuffer("Akaal");

        // Appending another string ("mrityu") to the existing StringBuffer object.
        stringBuffer.append("Mrityu");

        // Output the result: "Akaalmrityu"
        System.out.println(stringBuffer);

        // Reversing the string using the reverse() method of StringBuffer.
        // This method is also available in StringBuilder.
        System.out.println(stringBuffer.reverse());

    }
}
