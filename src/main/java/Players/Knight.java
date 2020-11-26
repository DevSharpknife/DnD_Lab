package Players;

public class Knight extends Melee{
    private String armour;

    public Knight(String name, String type, int hp, String armour) {
        super(name, type, hp);
        this.armour = armour;
    }

    public String getArmour() {
        return this.armour;
    }

    public void setArmour(String newArmour) {
        this.armour = newArmour;
    }
}
