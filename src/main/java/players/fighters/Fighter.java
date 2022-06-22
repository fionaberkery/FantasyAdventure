package players.fighters;

import eNums.Armour;
import eNums.Weapon;
import interfaces.IAttack;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    Weapon weapon;
    Armour armour;

    public Fighter(int health, Weapon weapon, Armour armour) {
        super(health);
        this.weapon = weapon;
        this.armour = armour;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public int getAttackDamage() {
        return this.weapon.getDamage() + this.armour.getDefenceValue();
    }

}

