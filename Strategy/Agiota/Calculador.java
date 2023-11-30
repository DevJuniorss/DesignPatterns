package Strategy.Agiota;

public class Calculador {
    private IEstrategiaDesconstos desconstos;
    public IEstrategiaDesconstos getDesconstos() {
        return desconstos;
    }
    public void setDesconstos(IEstrategiaDesconstos desconstos) {
        this.desconstos = desconstos;
    }
    public Calculador(IEstrategiaDesconstos desconstos) {
        this.desconstos = desconstos;
    }
    public double calcularDesconto(double value){
        return desconstos.aplicarDesconto(value);
    }
}
