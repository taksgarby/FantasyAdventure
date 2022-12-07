import enums.ElementType;
import org.junit.Before;
import org.junit.Test;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;

    @Before
    public void before() {
        spell = new Spell("Senzu Bean", "Gives power to heal",0, ElementType.EARTH);
    }

    @Test
    public void hasElementType() {
        assertEquals(ElementType.EARTH, spell.getElementType());
    }
}
