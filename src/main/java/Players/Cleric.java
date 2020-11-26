package Players;

import java.util.HashMap;

public class Cleric extends Character {

    private HashMap<String, Integer> healingTools;

    public Cleric(String name, String type, int hp) {
        super(name, type, hp);
        this.healingTools = new HashMap<>();
    }
}
