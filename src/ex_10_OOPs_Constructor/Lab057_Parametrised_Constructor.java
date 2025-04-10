package ex_10_OOPs_Constructor;

public class Lab057_Parametrised_Constructor {
    public static void main(String[] args) {

        Car2 c2 = new Car2();
        Car2 c1 = new Car2("Tesla","Streeet",1999);

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c4 = new Car2("Mahindra", "Scorpoio", 2020);
        System.out.println(c4.name);

        Car2 c5 = new Car2("CURVV", "TATA", 2024);
        System.out.println(c5.model);
    }
}

class  Car2 {

                String name;
                String model;
                int year;

    Car2() {
        model = "XXX";
        year = 1900;
        name = "Unknown Car!";
        System.out.println("DC");

    }
    Car2(String model_oc_arg, String name_oc_arg, int year_oc_arg) {

        this.name = name_oc_arg;
        this.model = model_oc_arg;
        this.year = year_oc_arg;

    }
}

