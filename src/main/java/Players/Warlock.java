package Players;

import Behaviours.ICast;

public class Warlock extends Caster implements ICast {

    private String demonGod;

    public Warlock(String name, String type, int hp, int gp, boolean isBaddie, String wand, String demonGod) {
        super(name, type, hp, gp, isBaddie, wand);
        this.demonGod = demonGod;
    }

    public String getDemonGod() {
        return demonGod;
    }


    @Override
    public void spellAttack(Character character, int damage) {
        character.removeHP(damage);
    }
}
