package tools;

public class HealingTool extends Tool{

    private int effectiveness;

    public HealingTool(String name, String description, int effectiveness){
        super(name, description);
        this.effectiveness = effectiveness;
    }

    public int getEffectiveness() {
        return this.effectiveness;
    }

}
