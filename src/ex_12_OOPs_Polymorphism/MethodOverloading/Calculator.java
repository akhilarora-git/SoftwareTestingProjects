package ex_12_OOPs_Polymorphism.MethodOverloading;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2,4));
        System.out.println(c1.add(4.13,3.22));
    }

}
