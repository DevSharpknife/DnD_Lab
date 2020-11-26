package Players;

public abstract class Character {
    private String name;
    private String type;
    private int hp;


    public Character(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void addHP(int healing) {
        this.hp = hp += healing;
    }

    public void removeHP(int damage) {
        this.hp = hp -= damage;
    }
}
