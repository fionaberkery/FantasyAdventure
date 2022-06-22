package players.fighters;

import eNums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(120, Weapon.AXE);
    }

    @Test
    public void hasHealth(){
        assertEquals(120, barbarian.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.AXE, barbarian.getWeapon());
    }

    @Test
    public void weaponHasDamageValue(){
        assertEquals(30, barbarian.getWeapon().getDamage());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

}