package ex_17_OOPs_Abstraction_Interfaces;

public class Lab080_Interface_Realtime {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();          // Upcasting to interface type
        Payment p2 = new CreditCardPayment();   // Another implementation

        p1.pay(500.00);
        p2.pay(1500.75);
    }
}
// Interface defines what a payment method must do
interface Payment {
    void pay(double amount);  // abstract method (no body)
}

// Implementation 1
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

// Implementation 2
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

