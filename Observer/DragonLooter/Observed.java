package Observer.DragonLooter;

public interface Observed {
    public void notificar();
    public void addObservador(Observer observed);
    public void rmvObservador(Observer observed);
}
