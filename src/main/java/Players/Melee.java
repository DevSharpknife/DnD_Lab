package Players;

import java.util.HashMap;

public abstract class Melee extends Character {
    private HashMap<String, Integer> weapons;

    public Melee(String name, String type, int hp) {
        super(name, type, hp);
        this.weapons = new HashMap<>();
    }

    public void addWeapon(String name, int damage){
        weapons.put(name, damage);
    }

}
