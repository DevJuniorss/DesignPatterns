package Singleton;

public class app {
    public static void main(String[] args) {
        app a = new app();
        a.iniciar();
    }

    public void iniciar(){
        Config silver = Config.getInstace("primeira cfg feita");
        System.out.println(silver.getCfg());
        Config shadow = Config.getInstace("clone da cfg primaria do silver");
        System.out.println(shadow.getCfg());
        shadow.setCfg("mudando cfg pela segunda vez, diminui a sensi de 3.5 para 2.5");
        System.out.println(shadow.getCfg());
        System.out.println(silver.getCfg());
    }
}
