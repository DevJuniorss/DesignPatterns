package Strategy.Agiota;

public class DescontoVIP implements IEstrategiaDesconstos {

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return (valorOriginal * 0.8);
    }
    
}
