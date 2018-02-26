package zoohandlung;

public class Fisch extends Tier {

    int maxTauchtiefe;
    int anzahlKiemen;

    public Fisch(String name, double gewicht) {
        super(name, gewicht);
    }

    public void schwimme() {
        System.out.println("Ich schwimme!");
    }

    public void blubber(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.println("blubb");
        }
    }
}
