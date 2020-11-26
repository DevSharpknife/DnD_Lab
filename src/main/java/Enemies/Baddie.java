package Enemies;

public abstract class Baddie {
    private String name;
    private String type;
    private int hp;
    private int loot;

    public Baddie(String name, String type, int hp, int loot) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.loot = loot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public void addHP(int healing) {
        this.hp += healing;
    }

    public void removeHP(int damage) {
        this.hp -= damage;
    }
}
