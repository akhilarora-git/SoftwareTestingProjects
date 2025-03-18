package TasksJava11x;

import java.util.Scanner;

public class Task03_IfCondition_OddEven {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number =scanner.nextInt();

        if (Number%2==0){
            System.out.println(Number +" Is Even Number");
        }
        else {
            System.out.println(Number + "Is Odd Number");
        }
    }
}
