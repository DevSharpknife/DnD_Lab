package Players;

import Behaviours.IAttack;
import Enemies.Baddie;

public class Barbarian extends Melee implements IAttack {
    private String loinCloth;

    public Barbarian(String name, String type, int hp, int gp, String loinCloth) {
        super(name, type, hp, gp);
        this.loinCloth = loinCloth;
    }

    public String getLoinCloth() {
        return loinCloth;
    }

    public void setLoinCloth(String loinCloth) {
        this.loinCloth = loinCloth;
    }

    @Override
    public void attack(Baddie baddie, int damage) {
        baddie.removeHP(damage);
    }
}
