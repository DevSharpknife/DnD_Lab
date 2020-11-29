package Players;

import Behaviours.ICast;

public class Wizard extends Caster implements ICast {

    private String robes;

    public Wizard(String name, String type, int hp, int gp, boolean isBaddie, String wand, String robes) {
        super(name, type, hp, gp, isBaddie, wand);
        this.robes = robes;
    }

    public String getRobes() {
        return robes;
    }

    public void setRobes(String robes) {
        this.robes = robes;
    }

    @Override
    public void spellAttack(Character character, int damage) {
        character.removeHP(damage);
    }
}
