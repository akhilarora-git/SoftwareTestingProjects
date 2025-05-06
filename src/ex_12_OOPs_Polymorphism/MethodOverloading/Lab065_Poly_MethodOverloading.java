package ex_12_OOPs_Polymorphism.MethodOverloading;

public class Lab065_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3, 4);
        int r2 = m1.add(3, 4, 9);
        double r3 = m1.add(3.14, 5.46);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }
}

    class MathOperations {
    // In the same class, When you have a method wit same
    // name but different arguments and different return type.

        int add(int a, int b){
            return a+b;
        }
        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }

        String add(String a, String b) {
            return a + b;
        }

    }