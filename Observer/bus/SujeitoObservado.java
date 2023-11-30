package Observer.bus;

public interface SujeitoObservado {
    public void nofiticar();
    public void addObservador(Observador ob);
    public void rmvObservador(Observador ob);
}
