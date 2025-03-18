package ex_03_TernaryOperator;

public class Lab017_TO_1 {
    public static void main(String[] args) {
        //Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int num = -3;
        String result = num >= 0 ? "Positive" : "Negative";
        System.out.println(result);

    }
}
