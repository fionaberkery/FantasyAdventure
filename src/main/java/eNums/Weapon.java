package eNums;

public enum Weapon {

    SWORD(50),
    AXE(30),
    CLUB(10);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
