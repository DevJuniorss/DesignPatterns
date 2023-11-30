package Observer.bus;

public class Prefeitura implements Observador {
    int viagens = 0;
    @Override
    public void estadoFoiAtualizado(GPSOnibus estadOnibus) {
        if (estadOnibus.equals(GPSOnibus.RODOVIARIA)) {
            this.viagens++;
            System.out.println("Viagens realizadas" + this.viagens );
        }
    }
    
}
