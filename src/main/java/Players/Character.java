package Players;

public abstract class Character {
    private String name;
    private String type;
    private int hp;
    private int gp;
    private boolean isBaddie;


    public Character(String name, String type, int hp, int gp, boolean isBaddie) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.gp = gp;
        this.isBaddie = isBaddie;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int newHp) {
        hp = newHp;
    }

    public int getGP() {
        return gp;
    }

    public void setGP(int gp) {
        this.gp = gp;
    }

    public boolean isBaddie() {
        return isBaddie;
    }

    public void setBaddie(boolean baddie) {
        isBaddie = baddie;
    }

    public void addHP(int healing) {
        this.hp += healing;
    }

    public void removeHP(int damage) {
        this.hp -= damage;
    }

    public void addGP(int gold) {
        gp += gold;
    }

    public void removeGP(int gold) {
        gp -= gold;
    }

    public void attack(Character character, int damage) {

    }
}
