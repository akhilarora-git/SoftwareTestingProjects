package ex_12_OOPs_Polymorphism.MethodOverloading;

public class Lab066_RealTime_MethodOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task(3);
        h1.task(3,5,6);
        h1.task(5,9);
    }
}

class Home {

    //single task
    void task(int a) {
        System.out.println(a);
    }
    //double task
    void task(int a, int b) {
        System.out.println(a + b);
    }
    //triple task
    void task(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
