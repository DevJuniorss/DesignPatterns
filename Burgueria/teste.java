package Burgueria;

import java.util.List;

public class teste {
    public static void main(String[] args) {
        teste test = new teste();
        test.inicia();        
    }
    public void inicia() {
        Historico.getInstace();
        ISanduba misto = new SandubaFrenchBreed();
        misto = new Presunto(misto);
        misto = new Queijo(misto);
        misto = new Alface(misto);
        misto = new Tomate(misto);
        misto = new Carne(misto);
        
        System.out.println(misto.getDescription() + misto.getCost());

        Historico.getInstace().addPedido(misto);
        
        List<ISanduba> historico = Historico.getInstace().getPedidos();

        System.out.println(historico.get(0).getDescription());
    }
}
