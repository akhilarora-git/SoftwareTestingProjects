package ex_06_Strings;

public class Lab032_String_Functions_Imp {
    public static void main(String[] args) {
        String name ="Harshit";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        // System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException


        // 2. concat()
        System.out.println(name.concat("Arora"));

        // 3. contains()
        System.out.println(name.contains("sh"));

        // 4. equals check
        System.out.println(name.equals("Harshit"));

        // 5. equalsIgoneCase
        System.out.println(name.equalsIgnoreCase("harshit"));

        // 6. indexOf() //
        System.out.println(name.indexOf('a'));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('r', 'R'));

        // 9. split()
        String name4 = "akhilarora2050@gmail.com@11223344";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("HARSHIT".toLowerCase());

        // 12. toUpperCase()
        System.out.println("HETVIK".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("H"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Harshit Arora     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Harshit"));


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);




    }
}
