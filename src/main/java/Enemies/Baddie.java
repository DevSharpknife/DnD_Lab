package Enemies;

public abstract class Baddie {
    private String name;
    private String type;
    private int hp;

    public Baddie(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
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

    public void addHP(int healing) {
        this.hp += healing;
    }

    public void removeHP(int damage) {
        this.hp -= damage;
    }
}
