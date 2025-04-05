package ex_05_Functions;

public class Lab026_User_Defined_One {
    public static void main(String[] args) {
        int r1 = sum_of_two_number(3,4);
        int r2 = sum_of_two_number(13,14);

        System.out.println(r1);
        System.out.println(r2);


    }

    static int sum_of_two_number(int a, int b){
        return a+b;
    }

}
