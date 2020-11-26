import Players.Warlock;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard garyPotter;

    @Before
    public void before() {
        garyPotter = new Wizard("Gary Potter", "Wizard", 250, 333, "Brown", "Purple");
    }

    @Test
    public void hasName() {
        assertEquals("Gary Potter", garyPotter.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Wizard", garyPotter.getType());
    }

    @Test
    public void hasHp() {
        assertEquals(250, garyPotter.getHp());
    }

    @Test
    public void hasWand() {
        assertEquals("Brown", garyPotter.getWand());
    }

    @Test
    public void hasRobes() {
        assertEquals("Purple", garyPotter.getRobes());
    }
}
