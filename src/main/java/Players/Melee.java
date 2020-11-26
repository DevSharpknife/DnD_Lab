package Players;

public abstract class Melee extends Character {
    private String weapon;

    public Melee(String name, String type, int hp, String weapon) {
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
