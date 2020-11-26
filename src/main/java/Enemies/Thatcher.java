package Enemies;

import Behaviours.IAttack;

public class Thatcher extends Baddie implements IAttack {
    private String weapon;

    public Thatcher(String name, String type, int hp, int loot, String weapon) {
        super(name, type, hp, loot);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Character character, int damage) {
        character.removeHP(damage);
    }
}
