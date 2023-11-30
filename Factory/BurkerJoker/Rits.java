package Factory.BurkerJoker;

public class Rits implements IFabricaBurguer {
    @Override
    public IBurguer criarHamburguer(String tipo) {
        switch (tipo) {
            case ("Xtubo"):return new Xtudo();
            case ("Misto"):return new Misto();
            case ("Xsalada"):return new Xsalada();
        
            default:
                return new Xtudo();
        }
    }
}
