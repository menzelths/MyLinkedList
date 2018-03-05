package MySinglyLinkedList1;

import zoohandlung.*; // damit der Typ Tier bekannt ist

public class MyLinkedList {

    Knoten ersterKnoten = null;
    Knoten letzterKnoten = null;

    public void add(Tier t) {
        Knoten k = new Knoten();
        k.inhalt = t;
        if (ersterKnoten == null) { //erstes Element
            ersterKnoten = k;
            letzterKnoten = k;
        } else {
            letzterKnoten.nachfolger = k;
            letzterKnoten = k;
        }
    }

    public void printAll() {
        Knoten aktuellerKnoten = ersterKnoten;
        while (aktuellerKnoten != null) {
            System.out.println(aktuellerKnoten.inhalt);
            aktuellerKnoten = aktuellerKnoten.nachfolger;
        }
    }
}
