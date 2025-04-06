package TasksJava11x;


import java.util.Scanner;

public class Task10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input to check the palindrome");
        String userInput = sc.next();
        String newReverseString = reverseString(userInput);

        if(newReverseString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }

    private static String reverseString(String userInput) {
        String reversed = "";
        for (int i=userInput.length()-1; i>=0; i--){
            reversed = reversed + userInput.charAt(i);
            System.out.println(i+reversed);

        }
        return reversed;

    }
}
