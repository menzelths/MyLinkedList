package zoohandlung;

public interface Laufen {  
    
    final LaufendesTier lt=new LaufendesTier(""+Math.random()*10);
    
    default public void laufe(){
        lt.laufe();
    }
    public int getAnzahlBeine();
    public void setAnzahlBeine(int anzahl);
}
