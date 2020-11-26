package Players;

public class Dwarf extends Melee {
    private String beard;

    public Dwarf(String name, String type, int hp, String beard) {
        super(name, type, hp);
        this.beard = beard;
    }
}
