package Enemies;

public class Thatcher extends Baddie {
    private String weapon;

    public Thatcher(String name, String type, int hp, String weapon) {
        super(name, type, hp);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
