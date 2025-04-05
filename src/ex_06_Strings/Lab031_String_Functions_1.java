package ex_06_Strings;

public class Lab031_String_Functions_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //SCP compares with SCP
        System.out.println(str1 == str3); //SCP compares with Object Area (Heap)
        System.out.println(str1.equals(str3)); //value is compared
    }
}
