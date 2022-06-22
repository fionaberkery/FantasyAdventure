package players.fighters;

import eNums.Enemy;
import eNums.Treasure;
import eNums.Weapon;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;
    Room room;
    ArrayList treasures;
    ArrayList enemies;

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

    @Test
    public void canCompleteARoomFALSE(){
        treasures = new ArrayList();
        treasures.add(Treasure.GEMS);
        treasures.add(Treasure.GOLD);
        enemies = new ArrayList();
        enemies.add(Enemy.ORC);
        enemies.add(Enemy.TROLL);
        room = new Room("Forest", treasures, enemies);
        assertEquals("room incomplete... keep trying", barbarian.completeRoom(room));
    }

    @Test
    public void canCompleteARoomTRUE(){
        treasures = new ArrayList();
        treasures.add(Treasure.GEMS);
        enemies = new ArrayList();
        enemies.add(Enemy.ORC);
        room = new Room("Forest", treasures, enemies);
        room.removeTreasure(Treasure.GEMS);
        room.defeatEnemy(Enemy.ORC);
        assertEquals("well done!! room completed", barbarian.completeRoom(room));
    }

}