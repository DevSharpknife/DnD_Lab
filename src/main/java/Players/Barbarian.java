package Players;

import Behaviours.IAttack;

public class Barbarian extends Melee implements IAttack {
    private String loinCloth;

    public Barbarian(String name, String type, int hp, int gp, boolean isBaddie, String loinCloth) {
        super(name, type, hp, gp, isBaddie);
        this.loinCloth = loinCloth;
    }

    public String getLoinCloth() {
        return loinCloth;
    }

    public void setLoinCloth(String loinCloth) {
        this.loinCloth = loinCloth;
    }

    @Override
    public void attack(Character character, int damage) {
        character.removeHP(damage);
    }
}
