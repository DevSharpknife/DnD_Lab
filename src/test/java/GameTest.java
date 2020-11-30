import Enemies.Thatcher;
import Levels.Game;
import Players.Barbarian;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void shouldThrowExceptionIfHeroIsBaddie() {
        Barbarian barbarian = new Barbarian("Conan", "Angry man", 200, 100, true, "Itsy Bitsy Teeny Weeny Yellow Polka Dot Mankini");
        Thatcher thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, true, "Venomous Tongue");
        Game game =  new Game(barbarian, thatcher);
        try {
           game.checkPlayers();
        } catch (Exception e) {
            assertFalse(game.arePlayersValid());
            assertEquals(e.getMessage(), "Hero cannot be a baddie");
        }
    }

    @Test
    public void shouldThrowExceptionIfEnemyIsGood() {
        Barbarian barbarian = new Barbarian("Conan", "Angry man", 200, 100, false, "Itsy Bitsy Teeny Weeny Yellow Polka Dot Mankini");
        Thatcher thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, false, "Venomous Tongue");
        Game game =  new Game(barbarian, thatcher);
        try {
           game.checkPlayers();
        } catch (Exception e) {
            assertFalse(game.arePlayersValid());
            assertEquals(e.getMessage(), "Enemy must be evil");
        }
    }

    @Test
    public void gameHasValidPlayersWhenEnemyIsBadandHeroIsGood() throws Exception {
        Barbarian barbarian = new Barbarian("Conan", "Angry man", 200, 100, false, "Itsy Bitsy Teeny Weeny Yellow Polka Dot Mankini");
        Thatcher thatcher = new Thatcher("Maggie", "Cold Bitch", 1000, 1200, true, "Venomous Tongue");
        Game game =  new Game(barbarian, thatcher);
        game.checkPlayers();
        assertTrue(game.arePlayersValid());
    }
}
