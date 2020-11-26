package Players;

public class Warlock extends Caster {

    private String demonGod;

    public Warlock(String name, String type, int hp, String wand, String demonGod) {
        super(name, type, hp, wand);
        this.demonGod = demonGod;
    }

    public String getDemonGod() {
        return demonGod;
    }
}
