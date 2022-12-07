package tools;

import enums.ElementType;

public class Spell extends AttackTool{

    private ElementType elementType;

    public Spell(String name, String description, int damage, ElementType elementType) {
        super(name, description, damage);
        this.elementType = elementType;
    }

    public ElementType getElementType() {
        return this.elementType;
    }

}
