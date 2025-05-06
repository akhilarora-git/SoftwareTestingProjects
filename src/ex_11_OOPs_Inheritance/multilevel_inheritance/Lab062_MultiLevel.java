package ex_11_OOPs_Inheritance.multilevel_inheritance;

public class Lab062_MultiLevel {
    public static void main(String[] args) {
        Son akhil = new Son();

        GrandFather g1 = new Son();
        g1.gf();
        g1.home();


        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Father();
        f2.home();
    }

}
