package ex_07_StringBuilder_StringBuffer;

public class Lab036_StringBuilder1 {
    public static void main(String[] args) {
        // Creating a new StringBuilder object with the initial content "Hello"
        // StringBuilder is mutable, so we can modify its contents without creating new objects
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // Appending " World" to the existing string
        // After this line, the content becomes: "Hello World"
        sb.append(" World");
        System.out.println(sb);

        // Reversing the entire content of the StringBuilder
        // After reversing, the content becomes: "dlroW olleH"
        sb.reverse();
        System.out.println(sb);
    }
}
