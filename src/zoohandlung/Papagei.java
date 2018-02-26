package zoohandlung;

public class Papagei extends Tier implements Laufen {

    String lieblingswort;
    double spannweite;
    int anzahlBeine;

    public Papagei(String name, double gewicht, String lieblingswort, double spannweite) {
        super(name, gewicht);
        this.lieblingswort = lieblingswort;
        this.spannweite = spannweite;
    }

    public void fliege() {
        System.out.println("Ich fliege");
    }

    public String sprich(String wort) {
        System.out.println(wort);
        return wort;
    }

    

    @Override
    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public int getAnzahlBeine() {
        return anzahlBeine;
    }
}
