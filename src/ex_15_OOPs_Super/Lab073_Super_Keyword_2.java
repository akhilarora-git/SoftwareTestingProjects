package ex_15_OOPs_Super;

public class Lab073_Super_Keyword_2 {
    public static void main(String[] args) {

    }
}

class GOD {
    void sound() {
        System.out.println("God!");
    }
}

class Animal extends GOD {
    protected String color = "White";

    void sound() {
        System.out.println("Animal Sound!");
        super.sound();
    }
}

class Dog extends Animal {
    private String color = "Black";

    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
