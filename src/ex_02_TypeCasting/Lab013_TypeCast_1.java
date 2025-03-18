package ex_02_TypeCasting;

public class Lab013_TypeCast_1 {
    public static void main(String[] args) {
        int val  = 300;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte)val; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2);
    }
}
