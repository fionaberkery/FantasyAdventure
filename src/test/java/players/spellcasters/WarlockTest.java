package players.spellcasters;

import eNums.Creature;
import eNums.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(300, Spell.FIREBALL, Creature.DRAGON);
    }

    @Test
    public void hasHealth(){
        assertEquals(300, warlock.getHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.FIREBALL, warlock.getSpell());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creature.DRAGON, warlock.getCreature());
    }

    @Test
    public void creatureHasDefendValue(){
        assertEquals(50, warlock.getCreature().getDefend());
    }

    @Test
    public void spellHasDamageValue(){
        assertEquals(75, warlock.getSpell().getDamage());
    }

    @Test
    public void canCastASpell(){
        warlock.castSpell();

    }

}