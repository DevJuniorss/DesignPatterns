package Strategy.DungeonFail;

public class Warrior  implements IWarrior{
    private IWeapons  weapon;
    
    public IWeapons getWeapon() {
        return weapon;
    }
    public void setWeapon(IWeapons weapon) {
        this.weapon = weapon;
    }
    @Override
    public void attack() {
        System.out.println("Leroy Jenkinssssss!!!! " + weapon.damage());
    }
}
