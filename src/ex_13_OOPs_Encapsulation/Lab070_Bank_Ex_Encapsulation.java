package ex_13_OOPs_Encapsulation;

public class Lab070_Bank_Ex_Encapsulation {
    public static void main(String[] args) {
        ICICIBank akaal = new ICICIBank("Akaal", 200);

        long bal = akaal.getBal();
        System.out.println(akaal.getName());
        System.out.println(bal);

        akaal.setBal(500, false);

        long updated_bal = akaal.getBal();
        System.out.println(updated_bal);


    }
}

class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not Allowed to change the bal");
        }
    }
}


//## Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.