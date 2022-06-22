package players.spellcasters;
import eNums.Creature;
import eNums.Spell;
import interfaces.IAttack;
import interfaces.IDefend;
import players.Player;

public class SpellCaster extends Player implements IAttack, IDefend {

    private Spell spell;
    private Creature creature;

    public SpellCaster(int health, Spell spell, Creature creature) {
        super(health);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public Creature getCreature() {
        return this.creature;
    }

    public void setSpell(Spell newSpell) {
        this.spell = newSpell;
    }

    public void setCreature(Creature newCreature) {
        this.creature = newCreature;
    }

    public int getAttackDamage(){
        return this.spell.getDamage() + getDefenceValue();
    }

    @Override
    public int getDefenceValue() {
        return this.creature.getDefend();
    }
}
