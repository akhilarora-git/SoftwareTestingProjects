package ex_21_Wrapper_Class;

import java.util.ArrayList;

public class Lab092_Wrapper_Conversion {
    public static void main(String[] args) {

        // 👶 Step 1: Primitive data type
        int number = 25;

        // 🎁 Step 2: Wrapping (Autoboxing) - int to Integer
        Integer wrappedNumber = number;

        // 📤 Step 3: Unwrapping (Unboxing) - Integer to int
        int unwrappedNumber = wrappedNumber;

        // 🧺 Step 4: Using wrapper class in ArrayList (Collections need Objects)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing
        list.add(20);
        list.add(wrappedNumber);
        list.add(unwrappedNumber);

        // 📋 Step 5: Printing results
        System.out.println("Original primitive: " + number);
        System.out.println("Wrapped object: " + wrappedNumber);
        System.out.println("Unwrapped value: " + unwrappedNumber);
        System.out.println("ArrayList of Integers: " + list);
    }
}
