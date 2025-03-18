package TasksJava11x;

import java.util.Scanner;

public class Task04_FibonacciSeries {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
        System.out.println("Enter to check Fibonacci Sequence!");

        int Num1 = Sc.nextInt();
        System.out.println("Fibonacci Series as Follows");
        int Fib1=0;
        int Fib2=1;
        System.out.println(Fib1);
        System.out.println(Fib2);

        for(int i=2;i<=Num1; i++){
            int sum = Fib1+Fib2;
            System.out.println(sum);

            Fib1=Fib2;
            Fib2=sum;
        }
    }
}
