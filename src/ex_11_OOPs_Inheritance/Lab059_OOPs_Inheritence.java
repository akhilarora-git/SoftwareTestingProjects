package ex_11_OOPs_Inheritance;

public class Lab059_OOPs_Inheritence {
    public static void main(String[] args) {
        Father F1 = new Father();
        System.out.println(F1.gold_f);
        F1.bhk2();
        System.out.println("Above was Fathers Attributes ");

        Son S1 = new Son();
        S1.bhk2();
        S1.bhk3();
        System.out.println(S1.gold_f);
        System.out.println("These are Sons and Father's Extended Attributes");

    }
}
    class Father{
        int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

        void bhk2() { //  Behaviour |  Method | Function | Data members
            System.out.println("Father - 2BHK");
        }
    }

    class Son extends Father{

        void bhk3() {
            System.out.println("3BHK Son");
        }
    }
