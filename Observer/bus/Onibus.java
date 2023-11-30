package Observer.bus;

import java.util.ArrayList;

public class Onibus implements SujeitoObservado {
   
    ArrayList<Observador> observadores = new ArrayList<Observador>();
    GPSOnibus bus;
    
    public Onibus() {
        this.bus  = GPSOnibus.RODOVIARIA;
    }

    public void setEstado(GPSOnibus estadoOnibus){
        this.bus = estadoOnibus;
        this.nofiticar();
    }
    public GPSOnibus bus(){
        return this.bus;
    }

    @Override
    public void nofiticar() {
        for (Observador observador : observadores) {
            observador.estadoFoiAtualizado(this.bus);
        }
    }
    @Override
    public void addObservador(Observador ob) {
        this.observadores.add(ob);
    }
    @Override
    public void rmvObservador(Observador ob) {
        this.observadores.remove(ob);
    }
}
