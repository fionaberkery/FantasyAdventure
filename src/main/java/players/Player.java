package players;

import interfaces.IAttack;
import rooms.Room;

public abstract class Player implements  IAttack{

    private int health;

    public Player(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    protected void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public void fight(IAttack opponent){
        int playerAttack = getAttackDamage();
        int computersAttack = opponent.getAttackDamage();
        if (computersAttack >= playerAttack){
            int newHealth = getHealth() - (computersAttack - playerAttack);
            setHealth(newHealth);
        }}

    public String completeRoom(Room room){
        if (room.getTreasuresCount() == 0 && room.getEnemiesCount() == 0){
            return "well done!! room completed";
        } else {
            return "room incomplete... keep trying";
        }
    }



}
