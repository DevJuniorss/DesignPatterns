package Strategy.Agiota;

public class Desconto implements IEstrategiaDesconstos{

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal;
    }
    
}
