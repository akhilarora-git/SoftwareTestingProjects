package ex_21_Wrapper_Class;

public class Lab093_WrapperEx2 {
    public static void main(String[] args) {

        // ✅ 1. Primitive to Wrapper (Autoboxing)
        // Java automatically converts the primitive value into its corresponding wrapper class
        int a = 10;
        Integer b = a; // Autoboxing: int → Integer
        System.out.println("Value of b (autoboxed): " + b); // Output: 10

        // ✅ 2. Accessing Wrapper Class Constants and Methods
        // Wrapper classes contain useful constants like MIN_VALUE and MAX_VALUE
        System.out.println("Minimum int value: " + Integer.MIN_VALUE); // -2^31
        System.out.println("Maximum int value: " + Integer.MAX_VALUE); // 2^31 - 1

        // ✅ 3. Wrapper to Primitive (Unboxing)
        // Java automatically converts the wrapper object back to its primitive type
        Integer a2 = 42;
        int v = a2; // Unboxing: Integer → int
        System.out.println("Value of v (unboxed): " + v); // Output: 42

        // ✅ 4. Getting primitive explicitly from wrapper using method
        // Useful if you want to be more clear and safe with conversions
        System.out.println("Primitive from wrapper b using intValue(): " + b.intValue());

        // ✅ 5. Parsing a string to a primitive
        // Very common in test automation (e.g., reading values from web pages or Excel)
        String numberStr = "123";
        int parsed = Integer.parseInt(numberStr); // Converts "123" to 123
        System.out.println("Parsed int from string: " + parsed);

        // ✅ 6. Converting a primitive to String using wrapper method
        // Useful for logging, comparisons, and sending string input to fields
        String strFromInt = Integer.toString(a); // 10 → "10"
        System.out.println("Converted String from int: " + strFromInt);

        // ✅ 7. Comparing Wrapper Objects
        // .equals() is used to compare values, NOT memory references (important in test validations)
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("Is num1 equal to num2? " + num1.equals(num2)); // true

        // ✅ 8. Using Other Wrapper Classes (Double, Character, Boolean)

        // 🔸 Double Wrapper - parsing and converting
        Double d = Double.valueOf("45.67"); // "45.67" → 45.67
        System.out.println("Double value: " + d);
        System.out.println("Double rounded (intValue): " + d.intValue()); // Converts to 45

        // 🔸 Character Wrapper - checking character properties
        Character ch = 'A';
        System.out.println("Character value: " + ch);
        System.out.println("Is letter? " + Character.isLetter(ch)); // true
        System.out.println("Is digit? " + Character.isDigit(ch));   // false

        // 🔸 Boolean Wrapper - useful when reading flags or true/false values
        Boolean bool = Boolean.valueOf("true"); // "true" → true
        System.out.println("Boolean value: " + bool); // Output: true

        // ✅ 9. Autoboxing in Collections
        // Collections (like ArrayList) can't store primitives directly — only objects (wrapper classes)
        java.util.ArrayList<Integer> marks = new java.util.ArrayList<>();
        marks.add(95); // Autoboxing happens here: int → Integer
        marks.add(85);
        System.out.println("Student marks list: " + marks); // Output: [95, 85]
    }
}
