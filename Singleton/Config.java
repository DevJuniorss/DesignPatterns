package Singleton;

public class Config {

    private static Config instace = null;

    private String cfg;

    public String getCfg() {
        return cfg;
    }
    public void setCfg(String cfg) {
        this.cfg = cfg;
    }
    private Config(String settings){
        this.cfg = settings;
    }
    public static Config getInstace(String newSettings){
        if(instace ==  null)
            instace = new Config(newSettings);
        return instace;
    }
}
