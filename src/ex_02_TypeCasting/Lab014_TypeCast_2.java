package ex_02_TypeCasting;

public class Lab014_TypeCast_2 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s); //5866
    }
}
