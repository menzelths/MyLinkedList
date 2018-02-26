package zoohandlung;

public class Loewe extends Tier implements Laufen {

    String maehnenShampooMarke;
    int anzahlBeine;
    

    public Loewe(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public Loewe(String name, double gewicht, String msm) {
        this.name = name;
        this.gewicht = gewicht;
        this.maehnenShampooMarke = msm;
    }

    public int bruelle(int dezibel) {
        System.out.println("Ich brülle mit " + " dB");
        return dezibel;
    }

 

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }
}
