import Enemies.Thatcher;
import Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Thatcher thatcher;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Gimli", "Son of Gloin", 180, "A GREAT BIG BUSHY BEARD");
    }


    @Test
    public void canGetName() {
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Son of Gloin", dwarf.getType());
    }

    @Test
    public void canGetHP() {
        assertEquals(180, dwarf.getHp());
    }

    @Test
    public void canGetBeard() {
        assertEquals("A GREAT BIG BUSHY BEARD", dwarf.getBeard());
    }
    @Test
    public void canSetName() {
        dwarf.setName("Warwick Davis");
        assertEquals("Warwick Davis", dwarf.getName());
    }

    @Test
    public void canSetType() {
        dwarf.setType("Antsy Shortarse");
        assertEquals("Antsy Shortarse", dwarf.getType());
    }

    @Test
    public void canSetHP() {
        dwarf.setHp(150);
        assertEquals(150, dwarf.getHp());
    }

    @Test
    public void canSetBeard() {
        dwarf.setBeard("Braided Ginger Dream Beard");
        assertEquals("Braided Ginger Dream Beard", dwarf.getBeard());
    }

    @Test
    public void canAttackBaddie() {
        thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, "Venomous Tongue");
        dwarf.attack(thatcher, 50);
        assertEquals(950, thatcher.getHP());
    }
}

