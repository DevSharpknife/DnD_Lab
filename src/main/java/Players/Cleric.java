package Players;

import Behaviours.IHeal;

import java.util.HashMap;

public class Cleric extends Character implements IHeal {

    private HashMap<String, Integer> healingTools;

    public Cleric(String name, String type, int hp) {
        super(name, type, hp);
        this.healingTools = new HashMap<>();
    }

    @Override
    public void heal(int health) {
        this.setHp(this.getHp() + health);
    }
}
