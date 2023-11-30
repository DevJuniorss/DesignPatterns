package Burgueria;

public class Carne extends SandubaDecorator{

    public Carne(ISanduba newSanduba) {
        super(newSanduba);
    }
    @Override
    public double getCost() {
        return (super.getCost() + 1.5);
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + "Carne - ");
    }
    
}
