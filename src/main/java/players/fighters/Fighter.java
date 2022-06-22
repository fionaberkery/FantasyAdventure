package players.fighters;

import eNums.Weapon;
import interfaces.IAttack;
import players.Player;

public abstract class Fighter extends Player implements IAttack {

    Weapon weapon;

    public Fighter(int health, Weapon weapon) {
        super(health);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public int getAttackDamage() {
        return this.weapon.getDamage();
    }

}

