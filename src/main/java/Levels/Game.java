package Levels;

import Levels.Rooms.MasterRoom;

public class Game {
    private MasterRoom room;
    private Character hero;
    private  Baddie enemy;

    public Game(MasterRoom room, Character hero, Baddie enemy) {
        this.room = room;
        this.hero = hero;
        this.enemy = enemy;
    }

    public void play() {

    }
}
