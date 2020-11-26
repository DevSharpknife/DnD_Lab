import Enemies.Thatcher;
import Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Thatcher thatcher;

    @Before
    public void setUp() {
        barbarian = new Barbarian("Conan", "Angry man", 200, 100, "Itsy Bitsy Teeny Weeny Yellow Polka Dot Mankini");
    }


    @Test
    public void canGetName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canGetType() {
        assertEquals("Angry man", barbarian.getType());
    }

    @Test
    public void canGetHP() {
        assertEquals(200, barbarian.getHp());
    }

    @Test
    public void canGetLoinCloth() {
        assertEquals("Itsy Bitsy Teeny Weeny Yellow Polka Dot Mankini", barbarian.getLoinCloth());
    }
    @Test
    public void canSetName() {
        barbarian.setName("Jimmy Fallon");
        assertEquals("Jimmy Fallon", barbarian.getName());
    }

    @Test
    public void canSetType() {
        barbarian.setType("Annoying child");
        assertEquals("Annoying child", barbarian.getType());
    }

    @Test
    public void canSetHP() {
        barbarian.setHp(8);
        assertEquals(8, barbarian.getHp());
    }

    @Test
    public void canSetLoinCloth() {
        barbarian.setLoinCloth("Nappy");
        assertEquals("Nappy", barbarian.getLoinCloth());
    }

    @Test
    public void canAttackBaddie() {
        thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, "Venomous Tongue");
        barbarian.attack(thatcher, 50);
        assertEquals(950, thatcher.getHP());
    }
}
