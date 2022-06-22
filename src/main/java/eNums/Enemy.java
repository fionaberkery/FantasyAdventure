package eNums;

public enum Enemy {

    TROLL(100),
    ORC(120);

    private final int enemyAttackValue;

    Enemy(int enemyAttackValue) {
        this.enemyAttackValue = enemyAttackValue;
    }

    public int getEnemyAttackValue() {
        return enemyAttackValue;
    }
}
