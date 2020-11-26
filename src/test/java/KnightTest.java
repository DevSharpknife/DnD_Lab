import Enemies.Thatcher;
import Players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Thatcher thatcher;

    @Before
    public void setUp() {
        knight = new Knight("Aragorn", "Strider", 120, 20, "Robin Hood Gear");
    }


    @Test
    public void canGetName() {
        assertEquals("Aragorn", knight.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Strider", knight.getType());
    }

    @Test
    public void canGetHP() {
        assertEquals(120, knight.getHp());
    }

    @Test
    public void canGetArmour() {
        assertEquals("Robin Hood Gear", knight.getArmour());
    }
    @Test
    public void canSetName() {
        knight.setName("Gladys Knight");
        assertEquals("Gladys Knight", knight.getName());
    }

    @Test
    public void canSetType() {
        knight.setType("Soul Singer");
        assertEquals("Soul Singer", knight.getType());
    }

    @Test
    public void canSetHP() {
        knight.setHp(180);
        assertEquals(180, knight.getHp());
    }

    @Test
    public void canSetArmour() {
        knight.setArmour("Shining");
        assertEquals("Shining", knight.getArmour());
    }

    @Test
    public void canAttackBaddie() {
        thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, "Venomous Tongue");
        knight.attack(thatcher, 50);
        assertEquals(950, thatcher.getHP());
    }
}

