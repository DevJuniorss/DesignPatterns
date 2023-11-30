package Strategy.DungeonFail;

public class Dungeon {
    public static void main(String[] args) {
        Warrior barbaro = new Warrior();
        barbaro.setWeapon(new GreatSword());
        barbaro.attack();

        barbaro.setWeapon(new OneHandSword());
        barbaro.attack();
    }
}
