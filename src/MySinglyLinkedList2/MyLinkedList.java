package MySinglyLinkedList2;

public class MyLinkedList {

    Knoten ersterKnoten = null;
    Knoten letzterKnoten = null;

    public void add(Object t) {
        Knoten k = new Knoten();
        k.inhalt = t;
        if (ersterKnoten == null) {
            ersterKnoten = k;
            letzterKnoten = k;
        }
        letzterKnoten.nachfolger = k;
        letzterKnoten = k;
    }

    public void printAll() {
        Knoten aktuellerKnoten = ersterKnoten;
        while (aktuellerKnoten != null) {
            System.out.println(aktuellerKnoten.inhalt);
            aktuellerKnoten = aktuellerKnoten.nachfolger;
        }
    }
}
