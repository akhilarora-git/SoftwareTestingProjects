package TasksJava11x;

public class Task02_CLI_InputTaking {
    public static void main(String[] args) {
        String Name = args[0];// First argument: Name
        int age = Integer.parseInt(args[1]);// Second argument: Age (converted to int)
        double salary =Double.parseDouble(args[2]) ;// Third argument: Salary (converted to double)
        System.out.println("The EMP Name is :" + Name);
        System.out.println("The EMP age is :"+(age));
        System.out.println("The EMP Salary is ₹:"+(salary));
    }
}
