public abstract class Geraet {
    protected boolean istEingeschaltet;
    protected String hersteller;
    
    public Geraet(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public String gibHersteller() {
        return this.hersteller;
    }
    
    public abstract void drueckePowerKnopf();
}
