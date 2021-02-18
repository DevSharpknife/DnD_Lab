import Baddies.Thatcher;
import Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThatcherTest {

    Thatcher thatcher;
    Cleric nightingale;

    @Before
    public void setUp() {
        thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, true, "Venomous Tongue");
    }


    @Test
    public void canGetName() {
        assertEquals("Maggie", thatcher.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Cold Bitch", thatcher.getType());
    }

    @Test
    public void canGetHP() {
        assertEquals(1000, thatcher.getHp());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Venomous Tongue", thatcher.getWeapon());
    }
    @Test
    public void canSetName() {
        thatcher.setName("Carol");
        assertEquals("Carol", thatcher.getName());
    }

    @Test
    public void canSetType() {
        thatcher.setType("Daughter");
        assertEquals("Daughter", thatcher.getType());
    }

    @Test
    public void canSetHP() {
        thatcher.setHp(10);
        assertEquals(10, thatcher.getHp());
    }

    @Test
    public void canSetWeapon() {
        thatcher.setWeapon("Redundancy");
        assertEquals("Redundancy", thatcher.getWeapon());
    }

    @Test
    public void canAddHP() {
        thatcher.addHP(50);
        assertEquals(1050, thatcher.getHp());
    }

    @Test
    public void canRemoveHP() {
        thatcher.removeHP(100);
        assertEquals(900, thatcher.getHp());
    }

    @Test
    public void canAttack() {
        nightingale = new Cleric("Nightingale", "Cleric", 200, 0, false);
        thatcher.attack(nightingale, 10);

    }
}

