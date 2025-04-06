package TasksJava11x;

import java.util.Scanner;

public class Task07_Triangle_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of first side of Triangle");
        int L1 = scanner.nextInt();
        System.out.println("Enter the Length of second side of Triangle");
        int L2 = scanner.nextInt();
        System.out.println("Enter the Length of third side of Triangle");
        int L3 = scanner.nextInt();

        if (L1 <= 0 || L2 <= 0 || L3 <= 0) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }


        if (L1 + L2 <= L3 || L2 + L3 <= L1 || L1 + L3 <= L2) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if (L1==L2 && L1==L3 && L2==L3){
            System.out.println("The Triangle is equilateral");
        }else if (L1==L2 || L1==L3 || L2==L3) {
            System.out.println("The Triangle is isosceles");
        } else {
            System.out.println("The Triangle is scalene");
        }
    }
}
