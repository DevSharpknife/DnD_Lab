package Players;

import Behaviours.ICast;
import Enemies.Baddie;

public class Wizard extends Caster implements ICast {

    private String robes;

    public Wizard(String name, String type, int hp, String wand, String robes) {
        super(name, type, hp, wand);
        this.robes = robes;
    }

    public String getRobes() {
        return robes;
    }

    public void setRobes(String robes) {
        this.robes = robes;
    }

    @Override
    public void spellAttack(Baddie baddie, int damage) {
        baddie.removeHP(damage);
    }
}
