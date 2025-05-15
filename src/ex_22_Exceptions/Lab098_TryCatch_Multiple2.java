package ex_22_Exceptions;

public class Lab098_TryCatch_Multiple2 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("ARE YOU FOOL");
        }
 //         Not possible as Big Exception is used before
//          catch (ArithmeticException e){
//          System.out.println("ARE YOU FOOL");
//        }
        System.out.println("2");
    }
}