package ex_08_Arrays;

import java.util.Scanner;

public class Lab046_Arrays_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number e.g n=3");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // R  - N
            for (int j = 0; j <= i; j++) { // Here we have considered that J cannot be > than i
                System.out.print("*"); // we cannot use println since that wil print in new line for each
            }
            System.out.println("");

        }
    }

}
