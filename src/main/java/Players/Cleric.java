package Players;

import Behaviours.IAttack;
import Behaviours.IHeal;

import java.util.HashMap;

public class Cleric extends Character implements IHeal, IAttack {

    private HashMap<String, Integer> healingTools;

    public Cleric(String name, String type, int hp, int gp, boolean isBaddie) {
        super(name, type, hp, gp, isBaddie);
        this.healingTools = new HashMap<>();
    }

    public int getNumberOfHealingTools() {
        return healingTools.size();
    }

    @Override
    public void heal(Character character, int health) {
        character.addHP(health);
    }
}
