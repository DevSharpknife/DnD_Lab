package Players;

import Behaviours.ICast;
import Enemies.Baddie;

public class Warlock extends Caster implements ICast {

    private String demonGod;

    public Warlock(String name, String type, int hp, int gp, String wand, String demonGod) {
        super(name, type, hp, gp, wand);
        this.demonGod = demonGod;
    }

    public String getDemonGod() {
        return demonGod;
    }


    @Override
    public void spellAttack(Baddie baddie, int damage) {
        baddie.removeHP(damage);
    }
}
