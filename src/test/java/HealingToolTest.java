import org.junit.Before;
import org.junit.Test;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    HealingTool healingTool;

    @Before
    public void before() {
        healingTool = new HealingTool("Senzu Beans", "Beans that give you power to heal.", 5);
    }

    @Test
    public void healingToolHasName() {
        assertEquals("Senzu Beans", healingTool.getName());
    }

    @Test
    public void healingToolHasDescription() {
        assertEquals("Beans that give you power to heal.", healingTool.getDescription());
    }

    @Test
    public void setHealingToolHasEffectiveness() {
        assertEquals(5, healingTool.getEffectiveness());
    }
}
