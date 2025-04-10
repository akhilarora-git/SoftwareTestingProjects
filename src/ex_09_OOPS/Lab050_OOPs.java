package ex_09_OOPS;

public class Lab050_OOPs {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name="arjun";
        p1.age=12;
        p1.isMale = true;
        p1.salary=15000.25;
        p1.legs = 2;
        p1.talk();
        System.out.println(p1.greet("arjun"));

        System.out.println(p1.name+"\n"+p1.legs+"\n"+p1.age+"\n"+p1.isMale+"\n"+p1.salary+"\n");
        Person p2 = new Person();
        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object

        p2.name = "Lucky";
        System.out.println(p2.name);

        Person p3  = new Person();
        p3.name = "Pramod";
        System.out.println(p3.name);


        new Person().name = "Not Ref name";

    }
}
class Person {
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    void sleep() {
        System.out.println("Sleeping");
    }

    String greet(String name) {
        return "Hello" + name;
    }
    void talk(){
        System.out.println("talking");
    }
    int remaining_amount(int salary, int tax){
        return salary-tax;
    }
}

