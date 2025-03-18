package ex_03_TernaryOperator;

public class Lab018_MaxNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(Math.max(x,y));

        int max = x > y ? x : y ;
        System.out.println(max);

    }
}
