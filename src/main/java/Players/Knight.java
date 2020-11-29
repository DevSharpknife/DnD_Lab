package Players;

import Behaviours.IAttack;

public class Knight extends Melee implements IAttack {
    private String armour;

    public Knight(String name, String type, int hp, int gp, boolean isBaddie, String armour) {
        super(name, type, hp, gp, isBaddie);
        this.armour = armour;
    }

    public String getArmour() {
        return this.armour;
    }

    public void setArmour(String newArmour) {
        this.armour = newArmour;
    }

    @Override
    public void attack(Character character, int damage) {
        character.removeHP(damage);
    }
}
