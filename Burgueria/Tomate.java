package Burgueria;

public class Tomate extends SandubaDecorator{

    public Tomate(ISanduba newSanduba) {
        super(newSanduba);
    }
    @Override
    public double getCost() {
        return (super.getCost() + 0.25);
    }
    @Override
    public String getDescription() {
        return (super.getDescription()+ "Tomate - ");
    }
}
