package ex_07_StringBuilder_StringBuffer;

public class Lab033_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        // ----------- STRING (IMMUTABLE) -----------
        // String is the most commonly used class for text in Java.
        // It is immutable, which means once it's created, it cannot be changed.
        // Stored in a special memory area called the String Pool.

        // This creates a string literal. It is stored in the string pool.
        String s0 = "Pramod";

        // This creates a new String object in the heap memory,
        // even if the same value already exists in the string pool.
        String s1 = new String("Pramod");



        // ----------- STRINGBUFFER (MUTABLE + THREAD-SAFE) -----------
        // StringBuffer is used to create strings that can be modified.
        // It is thread-safe (synchronized), meaning safe to use in multi-threaded environments.
        // Slightly slower than StringBuilder due to synchronization.

        StringBuffer stringBuffer = new StringBuffer("Arjun");



        // ----------- STRINGBUILDER (MUTABLE + NOT THREAD-SAFE) -----------
        // StringBuilder is also used to create modifiable strings.
        // It is not thread-safe (not synchronized), so it's faster than StringBuffer.
        // Best suited for single-threaded applications.

        StringBuilder stringBuilder = new StringBuilder("Arjun");



        // ----------- OUTPUT -----------
        // All will print the same content "Pramod" because they hold the same text,
        // but are managed differently in memory.
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
