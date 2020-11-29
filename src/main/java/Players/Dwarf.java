package Players;

import Behaviours.IAttack;

public class Dwarf extends Melee implements IAttack {
    private String beard;

    public Dwarf(String name, String type, int hp, int gp, boolean isBaddie, String beard) {
        super(name, type, hp, gp, isBaddie);
        this.beard = beard;
    }

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    @Override
    public void attack(Character character, int damage) {
        character.removeHP(damage);
    }
}
