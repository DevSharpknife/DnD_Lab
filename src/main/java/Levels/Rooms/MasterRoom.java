package Levels.Rooms;

import java.util.ArrayList;

public abstract class MasterRoom {
    private String name;
    private ArrayList<Character> characters;
    private ArrayList<Character> baddies;
    private int treasure;

    public MasterRoom(String name, ArrayList<Character> characters, ArrayList<Baddie> baddies, int treasure) {
        this.name = name;
        this.treasure = treasure;
        this.characters = new ArrayList<>();
        this.baddies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTreasure() {
        return treasure;
    }

    public void addBaddie(Baddie baddie) {
        this.baddies.add(baddie);
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }

    public void deadCheck() {
        for(int i=0; i < baddies.size(); i++) {
            Character character = this.character.get(i);
            if(character.getHp() == 0) {
                this.baddies.remove(i);
            }
        }
    }

    public String allBaddiesDead() {
        if(this.baddies.size() == 0) {
            return "LEVEL COMPLETE MOVE ON";
        }
        return "Keep fighting";
    }
}
