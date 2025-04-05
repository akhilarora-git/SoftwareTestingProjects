package ex_05_Functions;

public class Lab027_UDI_Part1 {
    public static void main(String[] args) {
        wp_wr_greet();
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);
        greet_with_details("arjun", 28, 100000.51);
        greet_with_full_name("arjun"," arora");
        sum_of_two(52,48);
    }
    static void wp_wr_greet() {
        System.out.println("Hi, How are you?");
    }
    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return "Hi, are you?";
    }
    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }
    static void greet_with_full_name(String firstname, String lastname){
        System.out.println("Hi, Your name is " + firstname + lastname);
    }
    static int sum_of_two(int a,int b){
        return a+b;
    }
}
