package Observer.bus;

public class Entinerario {
    public static void main(String[] args) {
        Entinerario e = new Entinerario();
        e.iniciar();
    }
    public void iniciar() {
        Onibus bus = new Onibus();
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Prefeitura p = new Prefeitura();

        bus.addObservador(a);
        bus.addObservador(b);
        bus.addObservador(p);

        bus.setEstado(GPSOnibus.RODOVIARIA);
        bus.setEstado(GPSOnibus.UFC);
        bus.setEstado(GPSOnibus.RODOVIARIA);
        bus.setEstado(GPSOnibus.UFC);
    }
}
