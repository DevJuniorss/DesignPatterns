package Burgueria;

public class Alface extends SandubaDecorator{

    public Alface(ISanduba newSanduba) {
        super(newSanduba);
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Alface - ");
    }
    
}
