package Players;

import Behaviours.IHeal;

import java.util.HashMap;

public class Cleric extends Character implements IHeal {

    private HashMap<String, Integer> healingTools;

    public Cleric(String name, String type, int hp) {
        super(name, type, hp);
        this.healingTools = new HashMap<>();
    }

    public int getNumberOfHealingTools() {
        return healingTools.size();
    }

    @Override
    public void heal(Character character, int health) {
        character.setHp(character.getHp() + health);
    }
}
