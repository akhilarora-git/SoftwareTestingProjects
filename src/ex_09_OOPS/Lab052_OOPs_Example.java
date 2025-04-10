package ex_09_OOPS;

public class Lab052_OOPs_Example {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name = "Nonica";
        c1.running();
        System.out.println(c1.Meowing(c1.name));
        System.out.println(c1.name);
    }
}

class Cat{

    String name;
    void running(){
        System.out.println("running");
    }
    String Meowing(String name){
        return name+" is meowing";
    }
}