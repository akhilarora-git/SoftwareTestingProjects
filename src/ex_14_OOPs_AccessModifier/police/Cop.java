package ex_14_OOPs_AccessModifier.police;

public class Cop {

    private int gun;
    String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

    protected void canIShoot() {
        System.out.println("Yes You can Shoot!");
    }
}
