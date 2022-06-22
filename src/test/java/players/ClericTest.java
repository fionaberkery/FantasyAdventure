package players;

import eNums.Armour;
import eNums.HealingTool;
import eNums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Dwarve;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Player player;

    @Before
    public void before(){
        cleric = new Cleric(500, HealingTool.HERB);
    }

    @Test
    public void canHealAPlayer(){
        player = new Dwarve(100, Weapon.AXE, Armour.HELMET);
        cleric.healPlayer(player);
        assertEquals(150, player.getHealth());
    }

    @Test
    public void hasHealth(){
        assertEquals(500, cleric.getHealth());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(HealingTool.HERB, cleric.getHealingTool());
    }

    @Test
    public void canChangeHealingTool(){
        cleric.setHealingTool(HealingTool.POTION);
        assertEquals(HealingTool.POTION, cleric.getHealingTool());
    }

}