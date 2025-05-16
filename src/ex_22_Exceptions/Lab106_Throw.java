package ex_22_Exceptions;

import java.util.Scanner;

public class Lab106_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
        private static void validateAge(int age) throws ArithmeticException, NullPointerException,Exception {
            if(age<18){
                throw new Exception("You are not eligible to go out!");
                // throw new NotValidAgeException("Not a Valid age");
            }else {
                System.out.println("You can Go!!");
            }
        }

}
