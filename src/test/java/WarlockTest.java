import Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock mudblood;

    @Before
    public void before() {
        mudblood = new Warlock("Mudblood", "Warlock", 100, "Skinless");
    }

    @Test
    public void hasName() {
        assertEquals("Mudblood", mudblood.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Warlock", mudblood.getType());
    }

    @Test
    public void hasHp() {
        assertEquals(100, mudblood.getHp());
    }

    @Test
    public void hasWand() {
        assertEquals("Skinless", mudblood.getWand());
    }
}
