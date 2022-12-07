package tools;

public class MythicalCreature extends Tool {

    private int defence;

    public MythicalCreature(String name, String description, int defence) {
        super(name, description);
        this.defence = defence;
    }

    public int getDefence() {
        return this.defence;
    }
}
