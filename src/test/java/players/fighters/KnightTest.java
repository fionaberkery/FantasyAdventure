package players.fighters;

import eNums.Creature;
import eNums.Spell;
import eNums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.spellcasters.SpellCaster;
import players.spellcasters.Warlock;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    Warlock warlock;

    @Before
    public void before(){
        knight = new Knight(150, Weapon.AXE);
    }

    @Test
    public void hasHealth(){
        assertEquals(150, knight.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.AXE, knight.getWeapon());
    }

    @Test
    public void weaponHasDamageValue(){
        assertEquals(30, knight.getWeapon().getDamage());
    }

    @Test
    public void canChangeWeapon(){
        knight.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, knight.getWeapon());
    }

    @Test
    public void knightCanFight(){
        warlock = new Warlock(300, Spell.FIREBALL, Creature.DRAGON);
        knight.fight(warlock);
        assertEquals(105, knight.getHealth());
    }



}