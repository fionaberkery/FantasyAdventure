package eNums;

public enum Creature {

    OGRE(20),
    DRAGON(50);

    private final int defend;

    Creature(int defend) {
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }
}
