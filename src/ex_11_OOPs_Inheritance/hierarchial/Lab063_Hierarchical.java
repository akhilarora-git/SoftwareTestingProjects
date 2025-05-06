package ex_11_OOPs_Inheritance.hierarchial;

public class Lab063_Hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Vedant v1 = new Vedant();
        Akhil a1 = new Akhil();
        Moksh m1 = new Moksh();

        f1.home();
        v1.home();
        m1.home();
        v1.v1();
        a1.h2();
        a1.home();
    }


}

class Father{
    void home(){
        System.out.println("3BHK - Father");
        System.out.println("3BHK - Father");
    }
}

class Akhil extends Father{
    void h2(){
        System.out.println("Home 2 - AK");
    }
}

class Moksh extends Father{
    void h3(){
        System.out.println("Home 3 - MA");
    }
}

class Vedant extends Father{
    void v1(){
        System.out.println("Home V1");
    }
}