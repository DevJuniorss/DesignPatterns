package Burgueria;

public class Queijo  extends SandubaDecorator{

    public Queijo(ISanduba newSanduba) {
        super(newSanduba);
    }

    @Override
    public double getCost() {
        return (super.getCost() + 0.5);
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + "Queijo - ");
    }   
}
