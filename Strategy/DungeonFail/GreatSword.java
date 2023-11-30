package Strategy.DungeonFail;

public class GreatSword  implements IWeapons{
    private int damage= 100;
    public int getDamage() {
        return damage;
    }
    @Override
    public int damage() {
        return getDamage();
    } 
}
