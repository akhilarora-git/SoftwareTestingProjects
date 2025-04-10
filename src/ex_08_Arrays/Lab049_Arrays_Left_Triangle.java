package ex_08_Arrays;

import java.util.Scanner;

public class Lab049_Arrays_Left_Triangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();

        for(int i= n;i >= 1;i--){
            for (int j = 1;j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
