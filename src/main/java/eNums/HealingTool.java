package eNums;

public enum HealingTool {

    POTION(80),
    HERB(50);

    private final int healingValue;

    HealingTool(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
