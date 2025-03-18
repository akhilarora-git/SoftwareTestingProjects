package TasksJava11x;

public class Task01_TrigonometryTask {
    public static double computeExpression(double x, double y, double z) {
        return Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));
    }

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double result = computeExpression(x, y, z);
        System.out.println("Result: " + result);
    }
}
