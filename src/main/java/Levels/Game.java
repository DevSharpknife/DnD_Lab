package Levels;

//import Levels.Rooms.MasterRoom;
import Players.Character;

public class Game {
//    private MasterRoom room;
    private Character hero;
    private Character enemy;

    private boolean playersValid;

    public Game(Character hero, Character enemy) {
//        this.room = room;
        this.hero = hero;
        this.enemy = enemy;
    }

    public void play() {

    }

    public void checkPlayers() throws Exception {
        if (hero.isBaddie()) {
            setPlayersValid(false);
            throw new Exception("Hero cannot be a baddie");
        }
        if (!enemy.isBaddie()) {
            setPlayersValid(false);
            throw new Exception("Enemy must be evil");
        }
        setPlayersValid(true);
    }

    public void setPlayersValid(boolean playersValid) {
        this.playersValid = playersValid;
    }
    public boolean arePlayersValid() {
        return playersValid;
    }
}
