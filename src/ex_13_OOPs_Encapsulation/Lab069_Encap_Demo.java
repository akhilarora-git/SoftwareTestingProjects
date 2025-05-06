package ex_13_OOPs_Encapsulation;

public class Lab069_Encap_Demo {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("arjun","pwssd225");
        // System.out.println(VWOGood.password);
        // password has private access in ex_13_OOPs_Encapsulation.GoodVWOLogin
        // System.out.println(VWOGood.username);

        vwoLogin1.setUsername("Akhil");
        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setPassword("newpass1223",true);
        System.out.println(vwoLogin1.getPassword());



    }
}

class VWOLogin{
    public String username;  // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    public String password;

    VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}

class GoodVWOLogin {


    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }

    //these getter and setters are known as Access Modifiers

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else{
            System.out.println("Not allowed to change the password!");
        }
    }


}