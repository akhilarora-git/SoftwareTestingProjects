package ex_22_Exceptions;

public class Lab107_Custom_Exception {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR",526);
        Bank icici = new Bank("INR",234);
        Bank oriental = new Bank("USD",200);
        //int total = icici.add(oriental);
        int total = icici.add(sbi);
        // different currencies should not be added
        System.out.println(total);


    }
}
