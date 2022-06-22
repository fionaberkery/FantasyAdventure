package players.spellcasters;

import eNums.Creature;
import eNums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(200, Spell.FIREBALL, Creature.DRAGON);
    }

    @Test
    public void hasHealth(){
        assertEquals(200, wizard.getHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FIREBALL, wizard.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creature.DRAGON, wizard.getCreature());
    }

    @Test
    public void creatureHasDefendValue(){
        assertEquals(50, wizard.getCreature().getDefend());
    }

    @Test
    public void spellHasDamageValue(){
        assertEquals(75, wizard.getSpell().getDamage());
    }

}