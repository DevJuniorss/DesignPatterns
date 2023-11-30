package Burgueria;

import java.util.ArrayList;

public class Historico {
    private static Historico firstInstace = null;
    private  ArrayList<ISanduba> pedidos = new ArrayList<>();
    
    public ArrayList<ISanduba> getPedidos() {
        return pedidos;
    }
    private Historico() {}
    public static Historico getInstace(){
        if(firstInstace == null)
            firstInstace = new Historico();
        return firstInstace;
    }
    
    public void addPedido(ISanduba sanduba){
        pedidos.add(sanduba);
    }
}
