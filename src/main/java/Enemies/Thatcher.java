package Enemies;

import Behaviours.IAttack;
import Players.Character;

public class Thatcher extends Character implements IAttack {
    private String weapon;

    public Thatcher(String name, String type, int hp, int gp, boolean isBaddie, String weapon) {
        super(name, type, hp, gp, isBaddie);
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
