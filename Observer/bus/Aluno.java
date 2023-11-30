package Observer.bus;

public class Aluno implements Observador{

    @Override
    public void estadoFoiAtualizado(GPSOnibus estadOnibus) {
        if(estadOnibus.equals(GPSOnibus.RODOVIARIA))
            System.out.println("Embarcar!");
        if(estadOnibus.equals(GPSOnibus.UFC))
            System.out.println("Corre que o RU ta fechando.");
    }
    
}
