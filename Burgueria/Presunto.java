package Burgueria;

public class Presunto  extends SandubaDecorator{

    public Presunto(ISanduba newSanduba) {
        super(newSanduba);
    }
    @Override
    public double getCost() {
        return (super.getCost() + 0.5);
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Presunto - ");
    }  
}
