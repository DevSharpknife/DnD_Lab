import Players.Cleric;
import Players.Dwarf;
import Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric nightingale;
    Dwarf gimli;

    @Before
    public void before() {
        nightingale = new Cleric("Nightingale", "Cleric", 200);
        gimli = new Dwarf("Gimli", "Dwarf", 130, "MASSIVE");
    }

    @Test
    public void hasName() {
        assertEquals("Nightingale", nightingale.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Cleric", nightingale.getType());
    }

    @Test
    public void hasHp() {
        assertEquals(200, nightingale.getHp());
    }

    @Test
    public void hasEmptyHealingTools() {
        assertEquals(0, nightingale.getNumberOfHealingTools());
    }

    @Test
    public void canHeal() {
        nightingale.heal(gimli, 10);
        assertEquals(140, gimli.getHp());
    }
}
