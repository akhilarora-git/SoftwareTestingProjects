package ex_10_OOPs_Constructor;

public class Lab056_Constructor_Default {
    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println(car1.name);
        System.out.println(car1.year);
        System.out.println(car1.model);

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);

    }
}

class Car{
    String name;
    int year;
    String model;

    // Creating a constructor
    Car(){
        name = "Unknow Car";
        year = 1991;
        model =  "XXX";
    }

}


