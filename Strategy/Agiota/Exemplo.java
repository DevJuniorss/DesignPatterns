package Strategy.Agiota;

public class Exemplo {
    public static void main(String[] args) {
        Exemplo e = new Exemplo();
        e.iniciar();
    }
    public void iniciar(){
        Calculador c = new Calculador( new Desconto());
        c.calcularDesconto(250);
        System.err.println(c.calcularDesconto(250));
        c.setDesconstos(new DescontoVIP());
        c.calcularDesconto(250);
        System.out.println(c.calcularDesconto(250));
    }
}
