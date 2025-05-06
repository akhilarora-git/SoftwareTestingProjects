package ex_12_OOPs_Polymorphism.MethodOveridding;

public class Lab067_MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();

        //This is how polymorphism works, the same method can be used with different variables
        Dog d1 = new Dog();
        d1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bark!!");
    }
}
