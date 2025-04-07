package ex_08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab041_Arrays_UserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays(int) only");
        int size = sc.nextInt();

        String[] numbers_marks =  new String[size];

        for (int i= 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the amount");//In this Loop ever input is being Scanned
            numbers_marks[i] = sc.next();
        }
        System.out.println("--------");

        for (int i= 0; i < numbers_marks.length;i++){
            System.out.println(numbers_marks[i]);//In this Loop ever input is being Printed
        }
        /*Arrays.sort(numbers_marks);
        for (int i= 0; i < numbers_marks.length;i++){
            System.out.println(numbers_marks[i]);//In this Loop ever input is being Printed
        }*/
        sc.close();
    }
}
