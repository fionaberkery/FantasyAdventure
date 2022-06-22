package players.fighters;

import eNums.Weapon;
import players.Player;

public abstract class Fighter extends Player {

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

    // the computer's weapon is the argument
    public void fight(IAttack attackMethod){
        int playersWeapon = getWeapon().getDamage();
        int computersWeapon = weapon.getDamage();
        if (computersWeapon >= playersWeapon){
            int newHealth = getHealth() - weapon.getDamage();
            setHealth(newHealth);
        }
    }

}
