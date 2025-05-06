package ex_11_OOPs_Inheritance.multilevel_inheritance;

public class Father extends GrandFather{

    void f(){
        System.out.println("2bhk - Father");
    }

    @Override
    void home() {
        System.out.println("F-S2");
    }
}
