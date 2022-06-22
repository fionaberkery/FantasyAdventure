package eNums;

public enum Treasure {


    GOLD(500),
    GEMS(300);

    private final int treasureValue;

    Treasure(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
