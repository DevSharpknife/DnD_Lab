package Players;

import Behaviours.IAttack;
import Enemies.Baddie;

public class Dwarf extends Melee implements IAttack {
    private String beard;

    public Dwarf(String name, String type, int hp, int gp, String beard) {
        super(name, type, hp, gp);
        this.beard = beard;
    }

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    @Override
    public void attack(Baddie baddie, int damage) {
        baddie.removeHP(damage);
    }
}
