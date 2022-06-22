package rooms;

import eNums.Enemy;
import eNums.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Room forest;
    Room dungeon;
    Room castle;
    ArrayList treasures;
    ArrayList enemies;

    @Before
    public void before(){
        treasures = new ArrayList();
        treasures.add(Treasure.GEMS);
        treasures.add(Treasure.GOLD);
        enemies = new ArrayList();
        enemies.add(Enemy.ORC);
        enemies.add(Enemy.TROLL);
        forest = new Room("Forest", treasures, enemies);
        dungeon = new Room("Dungeon", treasures, enemies);
        castle = new Room("Castle", treasures, enemies);
    }

    @Test
    public void roomHasName(){
        assertEquals("Forest", forest.getName());
    }

    @Test
    public void canAddTreasureToRoom(){
        forest.addTreasure(Treasure.GEMS);
        assertEquals(3, forest.getTreasuresCount());
    }

    @Test
    public void canAddEnemyToRoom(){
        forest.addEnemy(Enemy.ORC);
        assertEquals(3, forest.getEnemiesCount());
    }

//    @Test
//    public void roomHasTreasure(){
//        assertEquals(Treasure.GEMS, dungeon.getTreasure());
//    }
//
//    @Test
//    public void roomHasEnemy(){
//        assertEquals(Enemy.TROLL, castle.getEnemy());
//    }
//
//    @Test
//    public void enemyHasAttackValue(){
//        assertEquals(100, castle.getEnemy().getEnemyAttackValue());
//    }
//
//    @Test
//    public void treasureHasValue(){
//        assertEquals(300, dungeon.getTreasure().getTreasureValue());
//    }

}