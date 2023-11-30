package Strategy.DungeonFail;

public class OneHandSword implements IWeapons{
    private int damage = 50;
    public int getDamage() {
        return damage;
    }
    @Override
    public int damage() {
        return getDamage();
    }   
}
