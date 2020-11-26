package Players;

import Behaviours.ICast;

public class Warlock extends Caster implements ICast {

    private String demonGod;

    public Warlock(String name, String type, int hp, String wand, String demonGod) {
        super(name, type, hp, wand);
        this.demonGod = demonGod;
    }

    public String getDemonGod() {
        return demonGod;
    }

    @Override
    public void spellAttack(Baddie baddie, int damage) {
        baddie.removeHp(damage);
    }
}
