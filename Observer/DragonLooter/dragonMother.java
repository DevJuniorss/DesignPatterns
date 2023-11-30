package Observer.DragonLooter;

public class dragonMother implements Observer{
    private String name = "Charizard";
    private float hp = 1000f;
    private float mana = 10000f;
    public String getName() {
        return name;
    }
    public float getHp() {
        return hp;
    }
    public float getMana() {
        return mana;
    }
    public void pegaLadrao(){
        System.out.println("Alo Puliça!!!");
    }
    @Override
    public void attObservado(int qtdEgg) {
        pegaLadrao();
    }
    
}
