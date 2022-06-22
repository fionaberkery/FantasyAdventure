package players.fighters;

import eNums.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.WeakHashMap;

import static org.junit.Assert.*;

public class DwarveTest {

    Dwarve dwarve;
    Weapon weapon;

    @Before
    public void before(){
        dwarve = new Dwarve(100, Weapon.AXE);
    }

    @Test
    public void hasHealth(){
        assertEquals(100, dwarve.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.AXE, dwarve.getWeapon());
    }

    @Test
    public void weaponHasDamageValue(){
        assertEquals(30, dwarve.getWeapon().getDamage());
    }

    @Test
    public void canChangeWeapon(){
        dwarve.setWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, dwarve.getWeapon());
    }

}