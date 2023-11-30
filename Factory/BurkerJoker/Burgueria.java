package Factory.BurkerJoker;

public class Burgueria {
    public static void main(String[] args) {
        Burgueria b = new Burgueria();
        b.iniciar();
    }

    public void iniciar() {
        IBurguer burguer;
        IFabricaBurguer minhaBurgueriaFavorita = new Rits();
        burguer = minhaBurgueriaFavorita.criarHamburguer("Xtudo");
        System.out.println(burguer.leValor());
    }
}
