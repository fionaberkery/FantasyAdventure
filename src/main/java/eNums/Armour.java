package eNums;

public enum Armour {

    HELMET(50),
    CHAIN_MAIL(30),
    GLOVES(10);

    private final int defenceValue;

    Armour(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
