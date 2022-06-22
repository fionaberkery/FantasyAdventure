package players;

public abstract class Player {

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


}
