package tools;

public abstract class AttackTool extends Tool {
    private int damage;

    public AttackTool(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
