package eNums;

public enum Spell {

    FIREBALL(75),
    LIGHTENING_STRIKE(80);

    private final int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
