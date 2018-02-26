package zoohandlung;

public abstract class Tier {

    protected String name;
    double gewicht;
    String futterzeit;

    public Tier(){}
    
    public Tier(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }
    
    @Override
    public String toString(){
        return "Ich heiße "+name+" und wiege "+gewicht+" kg";
    }
}
