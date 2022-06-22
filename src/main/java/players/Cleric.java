package players;

import eNums.HealingTool;
import interfaces.IHeal;

public class Cleric extends Player implements IHeal {

    private HealingTool healingTool;


    public Cleric(int health, HealingTool healingTool) {
        super(health);
        this.healingTool = healingTool;
    }

    @Override
    public int getAttackDamage() {
        return 0;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public void healPlayer(Player player){
        player.setHealth(player.getHealth() +getHealingToolValue());
    }

    @Override
    public int getHealingToolValue() {
        return this.healingTool.getHealingValue();
    }
}
