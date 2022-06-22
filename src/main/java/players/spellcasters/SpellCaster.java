package players.spellcasters;
import eNums.Creature;
import eNums.Spell;
import players.Player;

public class SpellCaster extends Player {

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

    public void castSpell(IAttack){
        int playersSpell = getSpell().getDamage();
        int computersAttack = weapon.getDamage();
        if (computersWeapon >= playersWeapon){
            int newHealth = getHealth() - weapon.getDamage();
            setHealth(newHealth);
        }
    }
}
