package Players;

public abstract class Character {
    private String name;
    private String type;
    private int hp;
    private int gp;


    public Character(String name, String type, int hp, int gp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.gp = gp;
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

    public int getGP() {
        return gp;
    }

    public void setGP(int gp) {
        this.gp = gp;
    }

    public void addHP(int healing) {
        this.hp = hp += healing;
    }

    public void removeHP(int damage) {
        this.hp = hp -= damage;
    }

    public void addGP(int gold) {
        this.gp = gp += gold;
    }

    public void removeGP(int gold) {
        this.gp = gp -= gold;
    }
}
