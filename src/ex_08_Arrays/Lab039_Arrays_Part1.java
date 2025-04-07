package ex_08_Arrays;

public class Lab039_Arrays_Part1 {
    public static void main(String[] args) {
        String names[]={"arjun","sukhi","randhawa"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] names_atb11x = new String [3];
        names_atb11x[0] = "Arvind";
        names_atb11x[1] = "Pamma";
        names_atb11x[2] = "Randhawa";
        System.out.println(names_atb11x.length);
        System.out.println(names_atb11x[0]);
        System.out.println(names_atb11x[1]);
        System.out.println(names_atb11x[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
        System.out.println(is_male_data[1]);
        System.out.println(is_male_data[0]);




    }
}
