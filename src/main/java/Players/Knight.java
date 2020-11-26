package Players;

import Behaviours.IAttack;
import Enemies.Baddie;

public class Knight extends Melee implements IAttack {
    private String armour;

    public Knight(String name, String type, int hp, int gp, String armour) {
        super(name, type, hp, gp);
        this.armour = armour;
    }

    public String getArmour() {
        return this.armour;
    }

    public void setArmour(String newArmour) {
        this.armour = newArmour;
    }

    @Override
    public void attack(Baddie baddie, int damage) {
        baddie.removeHP(damage);
    }
}
