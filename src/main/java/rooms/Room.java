package rooms;
import eNums.Enemy;
import eNums.Treasure;
import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Treasure> treasures;
    private ArrayList<Enemy> enemies;

    public Room(String name, ArrayList treasures, ArrayList enemies) {
        this.name = name;
        this.treasures = treasures;
        this.enemies = enemies;
    }

    public ArrayList getTreasures(){
        return this.treasures;
    }

    public ArrayList getEnemies(){
        return this.enemies;
    }

    public int getTreasuresCount(){
        return this.treasures.size();
    }

    public int getEnemiesCount(){
        return this.enemies.size();
    }

    public String getName() {
        return name;
    }

    public void removeTreasure(Treasure treasure){
        this.treasures.remove(treasure);
    }

    public void defeatEnemy(Enemy enemy){
        this.enemies.remove(enemy);
    }

//    public Treasure getTreasure() {
//        return treasure;
//    }
//
//    public Enemy getEnemy() {
//        return enemy;
//    }

    public void setName(String name) {
        this.name = name;
    }


    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }
}
