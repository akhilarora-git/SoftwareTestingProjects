package ex_10_OOPs_Constructor;

public class Lab054_Constructor_Calling {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
        //this is Class         //this is object which carries the functions

    }
}
class WebAutomation{
    WebAutomation(){
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");
    }
}
