package ex_14_OOPs_AccessModifier.criminal;

import ex_14_OOPs_AccessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        //thief.canIShoot();    //because of Protected class
        //System.out.println(thief.gun); //because of Private class
    }
}
