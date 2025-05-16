package ex_22_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;

    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Integer add(Bank bankName) {
        if(bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        }else {
            try {
                throw new Exception("Currency Mismatched!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}
class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
