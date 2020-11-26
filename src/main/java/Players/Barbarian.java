package Players;

public class Barbarian extends Melee {
    private String loinCloth;

    public Barbarian(String name, String type, int hp, String loinCloth) {
        super(name, type, hp);
        this.loinCloth = loinCloth;
    }

    public String getLoinCloth() {
        return loinCloth;
    }

    public void setLoinCloth(String loinCloth) {
        this.loinCloth = loinCloth;
    }
}
