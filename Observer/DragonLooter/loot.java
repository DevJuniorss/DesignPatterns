package Observer.DragonLooter;

import java.util.ArrayList;

public class loot implements Observed{
    private String name;
    private float hp = 100f;
    private float mana = 100f;
    private int qtdEgg = 0;
    private ArrayList<Observer> Observers;
    public String getName() {
        return name;
    }
    public float getHp() {
        return hp;
    }
    public float getMana() {
        return mana;
    }
    public int getQtdEgg() {
        return qtdEgg;
    }
    public loot(String name, float hp, float mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }
    public void coletarEgg(){
        if(qtdEgg <= 100)
            this.qtdEgg+=25;
        if(qtdEgg >= 100)
            notificar();
        else
        System.out.println("Ovo Fugiu!!!");
    }
    @Override
    public String toString() {
        return ("loot [Name=" + getName() + ", hp=" + getHp() + ", mana=" + getMana() + "]");
    }
    @Override
    public void notificar() {
        for (Observer observer : Observers) {
            observer.attObservado(qtdEgg);
        }
    }
    @Override
    public void addObservador(Observer observed) {
        this.Observers.add(observed);
    }
    @Override
    public void rmvObservador(Observer observed) {
        this.Observers.remove(observed);
    }   
}
