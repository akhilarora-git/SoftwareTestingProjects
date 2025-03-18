package ex_03_TernaryOperator;

public class Lab020_TrickQuestion {
    public static void main(String[] args) {
    int num = 19;
    String result = (num > 10) ? (num > 20 ? "N>20" : "N<20"): "Both";
        System.out.println(result);
    }
}
