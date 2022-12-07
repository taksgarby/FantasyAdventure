package players;

import enums.Race;

public abstract class Player {

    private String name;
    private Race race;
    private int health;
    private int level;

    public Player(String name, Race race, int health, int level) {
        this.name = name;
        this.race = race;
        this.health = health;
        this.level = level;
    }
}
