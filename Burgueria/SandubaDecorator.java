package Burgueria;

public abstract class SandubaDecorator  implements ISanduba{
    protected ISanduba sanduba;

    public SandubaDecorator(ISanduba newSanduba) {
        this.sanduba = newSanduba;
    }
    @Override
    public double getCost() {
        return sanduba.getCost();
    }
    @Override
    public String getDescription() {
        return sanduba.getDescription();
    }
    
}
