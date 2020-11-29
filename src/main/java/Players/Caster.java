package Players;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Caster extends Character {

    private HashMap<String, Integer> mythicalCreature;
    private String wand;
    private HashMap<String, Integer> spells;

    public Caster(String name, String type, int hp, int gp, boolean isBaddie, String wand) {
        super(name, type, hp, gp, isBaddie);
        this.mythicalCreature = new HashMap<>();
        this.wand = wand;
        this.spells = new HashMap<>();
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }
}
